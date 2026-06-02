package ejercicio_2;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoJerarquico implements Empleado{

    public static final String ASIGNACION_EMPLEADO_INVALIDA = "No se a agregado el empleado, ya no que cumple con la jerarquia";
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
    }

    private static void validacionEsJerarquico(Cargo cargo) {
        if (!cargo.esSubordinadoDeDirector() && !cargo.esSubordinadoDeMandoMedio()) {
            throw new RuntimeException(VALIDA_EMPLADO_JERARQUICO);
        }
    }

    public void agregarEmpleado(Empleado empleado) {
        if (!cargo.tieneACargoA(empleado.cargo())) {
            cargo.lanzarExpecicion();
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
