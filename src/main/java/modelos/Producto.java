package modelos;

public class Producto extends Pantalla{

    private int codigo, inventario;
    private String nombre, descripcion, categoria;
    private double precio;

    public Producto(int codigo, int inventario, String nombre, String descripcion, String categoria, double precio) {
        this.codigo = codigo;
        this.inventario = inventario;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precio = precio;
    }

    public Producto() {
        this.codigo = 0;
        this.inventario = 0;
        this.nombre = null;
        this.descripcion = null;
        this.categoria = null;
        this.precio = 0;
    }

    public void ingresarDatos(){
        imprimir("Ingrese lo que se le pide\n");
        imprimirSinSalto("Código: ");
        setCodigo(leerEntero());
        imprimirSinSalto("Nombre: ");
        setNombre(leerString());
        imprimirSinSalto("Descipción: ");
        setDescripcion(leerString());
        imprimirSinSalto("Categoria: ");
        setCategoria(leerString());
        imprimirSinSalto("Precio: ");
        setPrecio(leerDouble());
        imprimirSinSalto("Invetario: ");
        setInventario(leerEntero());
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getInventario() {
        return inventario;
    }

    public void setInventario(int inventario) {
        this.inventario = inventario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
