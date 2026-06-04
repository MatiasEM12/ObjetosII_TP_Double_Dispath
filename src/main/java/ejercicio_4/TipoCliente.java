package ejercicio_4;

public abstract class TipoCliente {
    public abstract float impusto(ProductoFisico productoFisico);
    public abstract float impuesto(ServicioDigital servicioDigital);

    public abstract float costoEnvio(ProductoFisico productoFisico);
    public abstract float costoEnvio(ServicioDigital servicioDigital);
}