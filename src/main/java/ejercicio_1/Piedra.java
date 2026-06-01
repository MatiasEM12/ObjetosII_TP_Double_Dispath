package ejercicio_1;

public class Piedra extends ElementoJuego{
    @Override
    public boolean leGanaA(ElementoJuego eleccionComputadora) {
        return eleccionComputadora.pierdeContraPiedra();
    }

    @Override
    public boolean pierdeContraPapel() {
        return true;
    }

    @Override
    public boolean pierdeContraTijera() {
        return false;
    }

    @Override
    public boolean pierdeContraPiedra() {
        return false;
    }
}
