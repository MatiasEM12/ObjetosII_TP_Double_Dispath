package ejercicio_1;

public class Tijera extends ElementoJuego{
    @Override
    public boolean leGanaA(ElementoJuego eleccionComputadora) {
        return eleccionComputadora.pierdeContraTijera();
    }

    @Override
    public boolean pierdeContraPapel() {
        return false;
    }

    @Override
    public boolean pierdeContraTijera() {
        return false;
    }

    @Override
    public boolean pierdeContraPiedra() {
        return true;
    }
}
