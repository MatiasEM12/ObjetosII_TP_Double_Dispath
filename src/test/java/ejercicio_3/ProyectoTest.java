package ejercicio_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProyectoTest {

    @Test
    public void hitoriaNoPuedeContenerAHistoria() {
        var tareaCompleja = new TareaCompleja(10, new HistoriaDeUsuario());
        var tareaCompleja2 = new TareaCompleja(20, new HistoriaDeUsuario());
        var e = assertThrows(RuntimeException.class, () -> {
            tareaCompleja.agregarItem(tareaCompleja2);
        });

        assertEquals(TareaCompleja.VALIDA_HISTORIA, e.getMessage());
    }

    @Test
    public void hitoriaNoPuedeContenerASpike() {
        var tareaCompleja = new TareaCompleja(10, new HistoriaDeUsuario());
        var spike = new Tarea(20, new Spike());
        var e = assertThrows(RuntimeException.class, () -> {
            tareaCompleja.agregarItem(spike);
        });
        assertEquals(TareaCompleja.VALIDA_HISTORIA, e.getMessage());
    }

    @Test
    public void epicaNoPuedeContenerTareaDesarrollo() {
        var tareaCompleja = new TareaCompleja(10, new Epica());
        var td = new Tarea(20, new TareaDeDesarrollo());
        var e = assertThrows(RuntimeException.class, () -> {
            tareaCompleja.agregarItem(td);
        });
        assertEquals(Epica.VALIDA_EPICA, e.getMessage());
    }

    @Test
    public void noPuedoCrearUnaEpicaComoTareaSimple() {
        var e = assertThrows(RuntimeException.class, () -> {
            new Tarea(20, new Epica());
        });
        assertEquals(Tarea.VALIDA_TAREA_SIMPLE, e.getMessage());
    }

    @Test
    public void noPuedoCrearUnaHSComoTareaSimple() {
        var e = assertThrows(RuntimeException.class, () -> {
            new Tarea(20, new HistoriaDeUsuario());
        });
        assertEquals(Tarea.VALIDA_TAREA_SIMPLE, e.getMessage());
    }

    @Test
    public void noPuedoCrearUnSpikeComoTareaCompleja() {
        var e = assertThrows(RuntimeException.class, () -> {
            new TareaCompleja(20, new Spike());
        });
        assertEquals(TareaCompleja.VALIDA_TAREA_COMPLEJA, e.getMessage());
    }

    @Test
    public void historiaPuedeContenerTareaDeDesarrollo() {
        var historia = new TareaCompleja(10, new HistoriaDeUsuario());
        var tarea = new Tarea(20, new TareaDeDesarrollo());

        assertDoesNotThrow(() -> historia.agregarItem(tarea));
    }

    @Test
    public void epicaPuedeContenerSpike() {
        var epica = new TareaCompleja(10, new Epica());
        var spike = new Tarea(20, new Spike());

        assertDoesNotThrow(() -> epica.agregarItem(spike));
    }

    @Test
    public void horasTotalesDeTareaSimple() {
        var tarea = new Tarea(20, new TareaDeDesarrollo());

        assertEquals(20, tarea.horasTotales());
    }
    @Test
    public void horasTotalesHistoria() {
        var historia = new TareaCompleja(10, new HistoriaDeUsuario());

        historia.agregarItem(new Tarea(20, new TareaDeDesarrollo()));
        historia.agregarItem(new Tarea(30, new TareaDeDesarrollo()));

        assertEquals(60, historia.horasTotales());
    }

    @Test
    public void horasTotalesEpica() {
        var epica = new TareaCompleja(10, new Epica());

        epica.agregarItem(new Tarea(20, new Spike()));
        epica.agregarItem(new Tarea(30, new Spike()));

        assertEquals(60, epica.horasTotales());
    }

    @Test
    public void horasTotalesHistoriaVacia() {
        var historia = new TareaCompleja(10, new HistoriaDeUsuario());

        assertEquals(10, historia.horasTotales());
    }

    @Test
    public void horasTotalesEpicaVacia() {
        var epica = new TareaCompleja(10, new Epica());

        assertEquals(10, epica.horasTotales());
    }

    @Test
    public void epicaNoPuedeContenerHistoria() {
        var epica = new TareaCompleja(10, new Epica());
        var historia = new TareaCompleja(20, new HistoriaDeUsuario());

        var e = assertThrows(RuntimeException.class, () -> epica.agregarItem(historia));

        assertEquals(Epica.VALIDA_EPICA, e.getMessage());
    }

    @Test
    public void epicaNoPuedeContenerOtraEpica() {
        var epica = new TareaCompleja(10, new Epica());
        var otraEpica = new TareaCompleja(20, new Epica());

        var e = assertThrows(RuntimeException.class, () -> epica.agregarItem(otraEpica));

        assertEquals(Epica.VALIDA_EPICA, e.getMessage());
    }
}
