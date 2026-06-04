package ejercicio_4;

public class ProductoFisico implements Producto {
    private float precio;
    private float iva;
    private String nombre;
    private int peso;

    public ProductoFisico(String nombre, float precio, int peso) {
        this.precio = precio;
        this.nombre = nombre;
        this.peso = peso;
        this.iva = 0.21f;
    }

    @Override
    public float precio() {
        return precio;
    }

    @Override
    public float costoEnvio(TipoCliente tipo) {

        return tipo.costoEnvio(this);
    }

    @Override
    public float impuesto(TipoCliente tipo) {
        return tipo.impusto(this);
    }

    public float iva() {
        return iva;
    }

    public int peso(){
        return peso;
    }
}