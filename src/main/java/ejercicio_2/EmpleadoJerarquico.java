package ejercicio_2;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoJerarquico implements Empleado{

    public static  String ASIGNACION_EMPLEADO_INVALIDA = "";
    public static final String VALIDA_EMPLADO_JERARQUICO = "Solo directores o mandos medios son empleados jerarquicos";
    private final String nombre;
    private List<Empleado> empleados;
    private float salario;
    private Cargo cargo;

    public EmpleadoJerarquico(String nombre, float salario, Cargo cargo) {
        validacionEsJerarquico(cargo);
        this.nombre = nombre;
        this.salario = salario;
        this.cargo = cargo;
        this.empleados = new ArrayList<>();
        ASIGNACION_EMPLEADO_INVALIDA = cargo.validacion();
    }

    private static void validacionEsJerarquico(Cargo cargo) {
        if (!cargo.esJerarquico()) {
            throw new RuntimeException(VALIDA_EMPLADO_JERARQUICO);
        }
    }

    public void agregarEmpleado(Empleado empleado) {
        if (!cargo.tieneACargoA(empleado.cargo())) {
            throw new RuntimeException(ASIGNACION_EMPLEADO_INVALIDA);
        }

        this.empleados.add(empleado);
    }

    @Override
    public float calcularSalario() {
        float total = this.salario;
        for (Empleado m : empleados) {
            total += m.calcularSalario();
        }
        return total;
    }

    @Override
    public Cargo cargo() {
        return this.cargo;
    }

    @Override
    public boolean tieneDeEmpleadoA(Empleado Empleado) {
        return empleados.contains(Empleado);
    }
}
