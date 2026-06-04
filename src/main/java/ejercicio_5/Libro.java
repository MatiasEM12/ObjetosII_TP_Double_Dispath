package ejercicio_5;

public class Libro {


    private String nombre;
    private int cantidadPaginas;
    private Condicion condicion;

    public Libro(String nombre, int cantidadPaginas, Condicion condicion) {
        this.nombre = nombre;
        this.cantidadPaginas = cantidadPaginas;
        this.condicion = condicion;
    }

     public int calcularDiasPrestados() {
        return condicion.calcularDiasPrestados(cantidadPaginas);
    }
}
