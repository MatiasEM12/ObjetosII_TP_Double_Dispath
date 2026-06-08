package ejercicio_5;

import java.time.LocalDate;

public class Deteriorado extends Condicion {

    public static final int CANTIDAD_PAGINAS_LIBRO = 100;
    public static final int CANTIDAD_PAGINAS_INFERIOR_MENOR = 100;
    public static final int CANTIDAD_PAGINAS_INFERIOR_MAYOR = 2000;
    public static final int AÑO_DISCO = 1980;
    public static final int AÑOS_DE_ANTIGUEDAD_DE_REVISTA = 10;

    @Override
    public int calcularDiasPrestados(Libro libro) {
        int dias =  (int) Math.ceil((double) libro.cantidadPaginas() / CANTIDAD_PAGINAS_LIBRO); //redondear hacia arriba
        return dias ;
    }

    @Override
    public int calcularDiasPrestados(Disco disco) {
        if(disco.añoBanda() <  AÑO_DISCO){
            throw new RuntimeException("El disco no puede ser prestado porque es deteriorado y la banda es anterior a 1980");
        }
        return Math.max(1, Disco.DIA_MAXIMO_PRESTAR - 1);
    }

    @Override
    public int calcularDiasPrestados(Revista revista) {


        int diasBase;

        if (revista.cantidadPaginas() <CANTIDAD_PAGINAS_INFERIOR_MENOR) {
            diasBase = 2;
        } else if (revista.cantidadPaginas() < CANTIDAD_PAGINAS_INFERIOR_MAYOR) {
            diasBase = 3;
        } else {
            diasBase = 5;
        }

        if (revista.fechaPublicacion().until(LocalDate.now()).getYears() > AÑOS_DE_ANTIGUEDAD_DE_REVISTA) {
            return Math.max(1, diasBase - 3);
        }

        return Math.max(1, diasBase - 1);
    }
}
