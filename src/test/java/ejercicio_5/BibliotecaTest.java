package ejercicio_5;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class BibliotecaTest {

    @Test
    public void calculoDiasLibroNuevo(){
        var persona = new Persona();
        var prestamo = new Prestamo(new Persona(), new Libro(), LocalDate.now());
        var fechaDevolucion = prestamo.fechaDevolucion();

    }

    @Test
    public void calculoDiasLibroUsado(){}

    @Test
    public void calculoDiasLibroDeteriorado(){}

    @Test
    public void calculoDiasDiscoNuevo(){}

    @Test
    public void calculoDiasDiscoUsado(){}

    @Test
    public void calculoDiasDiscoDeteriorado(){}

    @Test
    public void calculoDiasRevistaNuevo(){}

    @Test
    public void calculoDiasRevistaUsado(){}

    @Test
    public void calculoDiasRevistaDeteriorado(){}
}
