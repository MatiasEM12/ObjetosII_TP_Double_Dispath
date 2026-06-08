package ejercicio_5;

public class Nuevo extends Condicion {


    public static final int CANTIDAD_PAGINAS_LIBRO = 100;
    public static final int CANTIDAD_PAGINAS_INFERIOR_MENOR = 100;
    public static final int CANTIDAD_PAGINAS_INFERIOR_MAYOR = 2000;
    public static final int AÑO_DISCO = 1980;


    @Override
    public int calcularDiasPrestados(Libro libro) {
        int dias =  (int) Math.ceil((double) libro.cantidadPaginas() / CANTIDAD_PAGINAS_LIBRO); //redondear hacia arriba
        return dias ;
    }

    @Override
    public int calcularDiasPrestados(Disco disco) {
        if(disco.añoBanda() < AÑO_DISCO){
            return Disco.DIA_MINIMO_PRESTAR;
        }
        return Disco.DIA_MAXIMO_PRESTAR;
    }

    @Override
    public int calcularDiasPrestados(Revista revista) {
        if (revista.cantidadPaginas() < CANTIDAD_PAGINAS_INFERIOR_MENOR) {
            return 2;
        }

        if (revista.cantidadPaginas() < CANTIDAD_PAGINAS_INFERIOR_MAYOR) {
            return 3;
        }

        return 5;
    }
}
