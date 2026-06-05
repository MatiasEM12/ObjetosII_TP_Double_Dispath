package ejercicio_5;

import java.time.LocalDate;

public class Deteriorado extends Condicion {

    @Override
    public int calcularDiasPrestados(Libro libro) {
        int dias =  (int) Math.ceil((double) libro.cantidadPaginas() / 100); //redondear hacia arriba
        return dias ;
    }

    @Override
    public int calcularDiasPrestados(Disco disco) {
        if(disco.añoBanda() <  1980){
            throw new RuntimeException("El disco no puede ser prestado porque es deteriorado y la banda es anterior a 1980");
        }
        return Math.max(1, Disco.DIA_MAXIMO_PRESTAR - 1);
    }

    @Override
    public int calcularDiasPrestados(Revista revista) {


        int diasBase;

        if (revista.cantidadPaginas() < 100) {
            diasBase = 2;
        } else if (revista.cantidadPaginas() < 2000) {
            diasBase = 3;
        } else {
            diasBase = 5;
        }

        if (revista.fechaPublicacion().until(LocalDate.now()).getYears() > 10) {
            return Math.max(1, diasBase - 3);
        }

        return Math.max(1, diasBase - 1);
    }
}
