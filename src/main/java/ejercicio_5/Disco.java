package ejercicio_5;

public class Disco implements Articulo{


    public static int DIA_MAXIMO_PRESTAR = 5;
    public static int DIA_MINIMO_PRESTAR = 3;
    private String nombre;
    private Condicion condicion;
    private int añoBanda;


    public Disco(String nombre, int añoBanda,Condicion condicion) {
        this.nombre = nombre;
        this.condicion = condicion;
        this.añoBanda = añoBanda;
    }

    @Override
    public int calcularDiasPrestados() {
        return condicion.calcularDiasPrestados(this);
    }

    public int añoBanda(){
        return añoBanda;
    }
}
