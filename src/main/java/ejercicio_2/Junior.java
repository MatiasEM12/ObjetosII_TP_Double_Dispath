package ejercicio_2;

public class Junior extends Cargo{
    public static final String VALIDA_JUNIOR = "Como junior no puedo tener a nadie a mi cargo";

    @Override
    public boolean  tieneACargoA(Cargo cargo) {
        return cargo.esSubordinadoDeJunior();
    }

    @Override
    public boolean esSubordinadoDeDirector() {
        return false;
    }

    @Override
    public boolean esSubordinadoDeMandoMedio() {
        return true;
    }

    @Override
    public boolean esSubordinadoDeJunior() {
        return false;
    }

    @Override
    public String validacion() {
        return VALIDA_JUNIOR;
    }

    @Override
    public boolean esJerarquico() {
        return false;
    }

}

