package ejercicio_3;

public class Epica extends TipoTarea {
    public static final String VALIDA_EPICA = "Solo spikes se permiten en una epica";
    @Override
    public boolean puedeContener(TipoTarea tarea) {
        return tarea.componeTareaEpica();
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
        return VALIDA_EPICA;
    }
}
