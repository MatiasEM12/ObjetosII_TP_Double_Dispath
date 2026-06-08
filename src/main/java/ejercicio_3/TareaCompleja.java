package ejercicio_3;

import java.util.ArrayList;
import java.util.List;

public class TareaCompleja implements ItemDeProyecto{
    public static final String VALIDA_HISTORIA = "Solo tareas de desarrollo se permiten en una historia de usuario";

    private String VALIDA_TAREA;
    public static final String VALIDA_TAREA_COMPLEJA = "No puede crear TS o Spike como Tarea Compleja";
    private List<ItemDeProyecto> items = new ArrayList<>();
    private int horasEstimadas;
    private TipoTarea tipoTarea;

    public TareaCompleja(int horasEstimadas, TipoTarea tipoTarea) {
        validarTarea(tipoTarea);

        this.horasEstimadas = horasEstimadas;
        this.tipoTarea = tipoTarea;
        this.VALIDA_TAREA = tipoTarea.valida();
    }

    private static void validarTarea(TipoTarea tipoTarea) {
        if (!tipoTarea.esCompleja()) {
            throw new RuntimeException(VALIDA_TAREA_COMPLEJA);
        }
    }

    public void agregarItem(ItemDeProyecto item) {
        //Una historia de usuario solo puede tener tareas de desarrollo
        //Una Epica solo puede tener Apikes

        if(!tipoTarea.puedeContener(item.tipoTarea())){
            throw new RuntimeException(VALIDA_TAREA);
        }

        this.items.add(item);
    }


    @Override
    public int horasTotales() {
        int horasTotales = this.horasEstimadas;
        for (ItemDeProyecto item : items) {
            horasTotales += item.horasTotales();
        }
        return horasTotales;
    }

    @Override
    public TipoTarea tipoTarea() {
        return this.tipoTarea;
    }
}
