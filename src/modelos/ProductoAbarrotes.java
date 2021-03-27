package modelos;

public class ProductoAbarrotes extends Producto {

    private double peso;

    public ProductoAbarrotes(int codigo, int inventario, String nombre, String descripcion, String categoria, double precio, double peso) {
        super(codigo, inventario, nombre, descripcion, categoria, precio);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
