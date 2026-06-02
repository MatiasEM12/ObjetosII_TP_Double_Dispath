package ejercicio_2;

public class MandoMedio extends Cargo{
    public static final String VALIDA_MANDOMEDIO = "Como mando medio solo juniors pueden estar a mi cargo";
    @Override
    public boolean  tieneACargoA(Cargo cargo) {
        return cargo.esSubordinadoDeMandoMedio();
    }

    @Override
    public boolean esSubordinadoDeDirector() {
        return true;
    }

    @Override
    public boolean esSubordinadoDeMandoMedio() {
        return false;
    }

    @Override
    public boolean esSubordinadoDeJunior() {
        return false;
    }

    @Override
    public String validacion() {
        return VALIDA_MANDOMEDIO;
    }

    @Override
    public boolean esJerarquico() {
        return true;
    }

}
