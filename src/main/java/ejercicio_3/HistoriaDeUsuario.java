package ejercicio_3;

public class HistoriaDeUsuario extends TipoTarea{
    public static final String VALIDA_HISTORIA = "Solo tareas de desarrollo se permiten en una historia de usuario";

    @Override
    public boolean puedeContener(TipoTarea tarea) {
        return tarea.componeTareaHistoriaDeUsuario();
    }

    @Override
    public boolean componeTareaSpike() {
        return false;
    }

    @Override
    public boolean componeTareaHistoriaDeUsuario() {
        return false;
    }

    @Override
    public boolean componeTareaTareaDeDesarrollo() {
        return false;
    }

    @Override
    public boolean componeTareaEpica() {
        return false;
    }

    @Override
    public boolean esCompleja() {
        return true;
    }

    @Override
    public boolean esSimple() {
        return false;
    }

    @Override
    public String valida() {
        return VALIDA_HISTORIA;
    }
}
