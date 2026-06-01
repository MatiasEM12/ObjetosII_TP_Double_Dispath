package ejercicio_1;

public class Papel extends ElementoJuego{
    @Override
    public boolean leGanaA(ElementoJuego eleccionComputadora) {
        return eleccionComputadora.pierdeContraPapel();
    }

    @Override
    public boolean pierdeContraPapel() {
        return false;
    }

    @Override
    public boolean pierdeContraTijera() {
        return true;
    }

    @Override
    public boolean pierdeContraPiedra() {
        return false;
    }
}
