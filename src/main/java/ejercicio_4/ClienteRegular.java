package ejercicio_4;

public class ClienteRegular extends TipoCliente {

    public static final float PORCENTAJE_COSTO_ENVIO = 0.10f;

    @Override
    public float impusto(ProductoFisico productoFisico) {
        return productoFisico.precio() * productoFisico.iva();
    }

    @Override
    public float impuesto(ServicioDigital servicioDigital) {
        return servicioDigital.precio() * PORCENTAJE_COSTO_ENVIO;
    }

    @Override
    public float costoEnvio(ProductoFisico productoFisico) {
        return productoFisico.precio() * productoFisico.peso();
    }

    @Override
    public float costoEnvio(ServicioDigital servicioDigital) {
        return 0;
    }
}
