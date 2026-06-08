package ejercicio_4;

public class ProductoFisico implements Producto {
    public static final float IVA = 0.21f;
    private float precio;
    String nombre;
    private int peso;

    public ProductoFisico(String nombre, float precio, int peso) {
        this.precio = precio;
        this.nombre = nombre;
        this.peso = peso;

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
        return IVA;
    }

    public int peso(){
        return peso;
    }
}