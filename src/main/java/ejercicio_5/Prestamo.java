package ejercicio_5;

import java.time.LocalDate;

public class Prestamo {

    private Persona persona;
    private Articulo articulo;
    private LocalDate fechaInicio;
    private LocalDate fechaDevolucion;

    public Prestamo(Persona persona, Articulo articulo, LocalDate fechaInicio) {
        this.persona = persona;
        this.articulo = articulo;
        this.fechaInicio = fechaInicio;
        this.fechaDevolucion = this.calcularFechaDevolucion(fechaInicio,articulo);
    }

    private LocalDate calcularFechaDevolucion(LocalDate fechaInicio,Articulo articulo) {
        return fechaInicio.plusDays(articulo.calcularDiasPrestados());
    }

    public LocalDate fechaDevolucion(){
        return fechaDevolucion;
    }
}
