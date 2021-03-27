package modelos;

public class ProductoTecnologia extends Producto {

    private double RAM, Almacenamiento, Pulgadas;

    public ProductoTecnologia(int codigo, int inventario, String nombre, String descripcion, String categoria, double precio, double RAM, double almacenamiento, double pulgadas) {
        super(codigo, inventario, nombre, descripcion, categoria, precio);
        this.RAM = RAM;
        Almacenamiento = almacenamiento;
        Pulgadas = pulgadas;
    }
}
