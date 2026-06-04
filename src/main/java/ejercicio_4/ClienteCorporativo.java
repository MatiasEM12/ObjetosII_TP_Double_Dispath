package ejercicio_4;

public class ClienteCorporativo extends TipoCliente {


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
        return costo - (costo * 0.5f);
    }

    @Override
    public float costoEnvio(ServicioDigital servicioDigital) {
        return 0;
    }
}
