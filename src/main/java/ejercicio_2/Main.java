package ejercicio_2;

public class Main {
    public static void main(String[] args) {
        var director1 = new EmpleadoJerarquico("unDirector", 100, new Director());
        var mandoMedio = new EmpleadoJerarquico("mandoMedio", 50, new MandoMedio());
        try {

            director1.agregarEmpleado(mandoMedio);
            var empleadoRegular = new EmpleadoRegular("empleadoRegular", 100);
            mandoMedio.agregarEmpleado(empleadoRegular);
            director1.agregarEmpleado(empleadoRegular);
            // lanza Exception ya que un Director no puede tener a su cargo a un EmpleadoRegular xq rompe la jerarquia


        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        new LaserX(director1).imprimirCostoSalarial();
    }
}
