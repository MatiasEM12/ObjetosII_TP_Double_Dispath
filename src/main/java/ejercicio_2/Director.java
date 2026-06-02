package ejercicio_2;

public class Director extends Cargo {
    public static final String VALIDA_DIRECTOR = "Como director solo mandos medios pueden estar a mi cargo";
    @Override
    public boolean tieneACargoA(Cargo cargo) {
        return cargo.esSubordinadoDeDirector();
    }

    @Override
    public boolean esSubordinadoDeDirector() {
        return false;
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
    public String validacionJerarquia() {
        return VALIDA_DIRECTOR;
    }


}
