package ejercicio_4;

public class ClienteCorporativo extends TipoCliente {


    public static final float PORCENTAJE_COSTO_ENVIO = 0.5f;

    @Override
    public float impusto(ProductoFisico productoFisico) {

        return productoFisico.precio() * productoFisico.iva();
    }

    @Override
    public float impuesto(ServicioDigital servicioDigital) {

        return 0;
    }

    @Override
    public float costoEnvio(ProductoFisico productoFisico) {
        var costo =  productoFisico.precio() * productoFisico.peso();
        return costo - (costo * PORCENTAJE_COSTO_ENVIO);
    }


    @Override
    public float costoEnvio(ServicioDigital servicioDigital) {
        return 0;
    }
}
