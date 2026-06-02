package ejercicio_2;


public abstract class Cargo {

    public abstract boolean tieneACargoA(Cargo cargo);

    public abstract boolean esSubordinadoDeDirector();

    public abstract boolean esSubordinadoDeMandoMedio();

    public abstract boolean esSubordinadoDeJunior();

    public abstract String validacion();

    public abstract boolean esJerarquico();
}