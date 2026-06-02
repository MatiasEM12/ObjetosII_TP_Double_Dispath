package ejercicio_3;

public class Spike extends TipoTarea {
    @Override
    public boolean puedeContener(TipoTarea tarea) {
        return tarea.componeTareaSpike();
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
        return true;
    }

    @Override
    public boolean esCompleja() {
        return false;
    }

    @Override
    public boolean esSimple() {
        return true;
    }

    @Override
    public String valida() {
        return  "Solo spike se permiten en una epica";
    }
}
