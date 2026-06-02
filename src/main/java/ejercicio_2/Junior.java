package ejercicio_2;

public class Junior extends Cargo{
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

}
