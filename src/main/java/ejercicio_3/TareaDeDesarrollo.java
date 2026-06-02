package ejercicio_3;

public class TareaDeDesarrollo extends TipoTarea {
    @Override
    public boolean puedeContener(TipoTarea tarea) {
        return tarea.componeTareaTareaDeDesarrollo();
    }

    @Override
    public boolean componeTareaSpike() {
        return false;
    }

    @Override
    public boolean componeTareaHistoriaDeUsuario() {
        return true;
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
        return false;
    }

    @Override
    public boolean esSimple() {
        return true;
    }

    @Override
    public String valida() {
        return "Solo tareas de desarrollo se permiten en una historia de usuario";
    }
}
