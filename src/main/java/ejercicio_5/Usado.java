package ejercicio_5;

public class Usado extends Condicion {

    @Override
    public int calcularDiasPrestados(Libro libro) {
        int dias =  (int) Math.ceil((double) libro.cantidadPaginas() / 100); //redondear hacia arriba
        return dias ;
    }

    @Override
    public int calcularDiasPrestados(Disco disco) {
        if(disco.añoBanda() <  1980){
            return Disco.DIA_MINIMO_PRESTAR;
        }
        return Disco.DIA_MAXIMO_PRESTAR;
    }

    @Override
    public int calcularDiasPrestados(Revista revista) {

        if (revista.cantidadPaginas() < 100) {
            return 2;
        }

        if (revista.cantidadPaginas() < 2000) {
            return 3;
        }

        return 5;
    }
}
