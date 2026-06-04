package ejercicio_5;

public class Disco implements Articulo{

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
        return condicion.calcularDiasPrestadosPorAño(añoBanda);
    }
}
