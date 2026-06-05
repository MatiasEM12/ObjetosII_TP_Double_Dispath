package ejercicio_5;

import java.time.LocalDate;

public class Revista implements Articulo{

    private LocalDate fechaPublicacion;
    private int cantidadPaginas;
    private Condicion condicion;

    public Revista(LocalDate fechaPublicacion, int cantidadPaginas,Condicion condicion) {
        this.fechaPublicacion = fechaPublicacion;
        this.cantidadPaginas = cantidadPaginas;
        this.condicion = condicion;
    }
    @Override
    public int calcularDiasPrestados() {
        return condicion.calcularDiasPrestados(this);
    }

    public LocalDate fechaPublicacion() {
        return fechaPublicacion;
    }
    public int cantidadPaginas() {
        return cantidadPaginas;
    }

}
