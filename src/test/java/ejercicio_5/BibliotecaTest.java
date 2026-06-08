package ejercicio_5;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BibliotecaTest {

    @Test
    public void calculoDiasLibroNuevo(){
        var persona = new Persona("12345678","pepe","argento");
        var libro = new Libro("El Camino de los Reyes", 1300, new Nuevo());
        var prestamo = new Prestamo( persona, libro, LocalDate.now());

        var fechaDevolucion = prestamo.fechaDevolucion();

        assertEquals(LocalDate.now().plusDays(13),fechaDevolucion);
    }

    @Test
    public void calculoDiasLibroUsado(){
        var persona = new Persona("12345678","pepe","argento");
        var libro = new Libro("El Camino de los Reyes", 1300, new Usado());
        var prestamo = new Prestamo( persona, libro, LocalDate.now());

        var fechaDevolucion = prestamo.fechaDevolucion();

        assertEquals(LocalDate.now().plusDays(13),fechaDevolucion);
    }

    @Test
    public void calculoDiasLibroDeteriorado(){
        var persona = new Persona("12345678","pepe","argento");
        var libro = new Libro("El Camino de los Reyes", 1300, new Deteriorado());
        var prestamo = new Prestamo( persona, libro, LocalDate.now());

        var fechaDevolucion = prestamo.fechaDevolucion();

        assertEquals(LocalDate.now().plusDays(13),fechaDevolucion);
    }

    @Test
    public void calculoDiasDiscoNuevo(){
        var persona = new Persona("12345678","pepe","argento");
        var disco = new Disco("Rock or Bust", 2014, new Nuevo());
        var prestamo = new Prestamo( persona, disco, LocalDate.now());

        var fechaDevolucion = prestamo.fechaDevolucion();

        assertEquals(LocalDate.now().plusDays(5),fechaDevolucion);
    }

    @Test
    public void calculoDiasDiscoUsado(){
        var persona = new Persona("12345678","pepe","argento");
        var disco = new Disco("Black Sabbath", 1970, new Usado());
        var prestamo = new Prestamo( persona, disco, LocalDate.now());

        var fechaDevolucion = prestamo.fechaDevolucion();

        assertEquals(LocalDate.now().plusDays(3),fechaDevolucion);
    }

    @Test
    public void calculoDiasDiscoDeteriorado(){
        var persona = new Persona("12345678","pepe","argento");
        var disco = new Disco("Cancion animal", 1990, new Deteriorado());
        var prestamo = new Prestamo( persona, disco, LocalDate.now());

        var fechaDevolucion = prestamo.fechaDevolucion();

        assertEquals(LocalDate.now().plusDays(4),fechaDevolucion);
    }

    @Test
    public void calculoDiasRevistaNuevo(){
        var persona = new Persona("12345678","pepe","argento");
        var revista = new Revista(LocalDate.of(2000, 3, 1),50, new Nuevo());
        var prestamo = new Prestamo( persona, revista, LocalDate.now());

        var fechaDevolucion = prestamo.fechaDevolucion();

        assertEquals(LocalDate.now().plusDays(2),fechaDevolucion);
    }

    @Test
    public void calculoDiasRevistaUsado(){
        var persona = new Persona("12345678","pepe","argento");
        var revista = new Revista(LocalDate.of(2000, 3, 1),350, new Usado());
        var prestamo = new Prestamo( persona, revista, LocalDate.now());

        var fechaDevolucion = prestamo.fechaDevolucion();

        assertEquals(LocalDate.now().plusDays(3),fechaDevolucion);
    }

    @Test
    public void calculoDiasRevistaDeteriorado(){
        var persona = new Persona("12345678","pepe","argento");
        var revista = new Revista(LocalDate.of(2000, 3, 1),350, new Deteriorado());
        var prestamo = new Prestamo( persona, revista, LocalDate.now());

        var fechaDevolucion = prestamo.fechaDevolucion();

        assertEquals(LocalDate.now().plusDays(1),fechaDevolucion);
    }
}
