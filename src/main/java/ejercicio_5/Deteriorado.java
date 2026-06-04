package ejercicio_5;

public class Deteriorado extends Condicion {

    @Override
    public int calcularDiasPrestados(int cantidadPaginas) {
        int dias =  (int) Math.ceil((double) cantidadPaginas / 100); //redondear hacia arriba
        return dias ;
    }

    @Override
    public int calcularDiasPrestadosPorAño(int añoBanda) {
        if(añoBanda <  1980){
            return 2;
        }
        return 5;
    }
}
