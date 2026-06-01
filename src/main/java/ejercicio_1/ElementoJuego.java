package ejercicio_1;

public abstract class ElementoJuego {


    public abstract boolean  leGanaA(ElementoJuego eleccionComputadora);

    public abstract boolean pierdeContraPapel();
    public abstract boolean pierdeContraTijera();
    public abstract boolean pierdeContraPiedra();
    public boolean empataCon(ElementoJuego elementoJuego){
        return this.getClass().equals(elementoJuego.getClass());
    }

}
