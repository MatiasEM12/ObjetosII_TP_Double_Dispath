package ejercicio_3;

public abstract class TipoTarea {

    public abstract boolean puedeContener( TipoTarea tarea );

    public abstract boolean componeTareaSpike();

    public abstract boolean componeTareaHistoriaDeUsuario();

    public abstract boolean componeTareaTareaDeDesarrollo();

     public abstract boolean componeTareaEpica();

     public abstract boolean esCompleja();

     public abstract boolean esSimple();

    public abstract  String valida();

}
