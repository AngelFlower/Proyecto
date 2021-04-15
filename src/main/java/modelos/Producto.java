package modelos;

public class Producto extends Pantalla{

    private int codigo, categoria;
    private String nombre, descripcion;
    private double precio;

    public Producto(int codigo, String nombre, String descripcion, int categoria, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precio = precio;
    }

    public Producto() {
        this.codigo = 0;
        this.nombre = null;
        this.descripcion = null;
        this.categoria = 0;
        this.precio = 0;
    }

    public void ingresarDatos(){
        imprimir("Ingrese lo que se le pide\n");
        imprimirSinSalto("Nombre: ");
        setNombre(leerString());
        imprimirSinSalto("Descipción: ");
        setDescripcion(leerString());
        imprimirSinSalto("Categoria: ");
        setCategoria(leerEntero());
        imprimirSinSalto("Precio: ");
        setPrecio(leerDouble());
    }

    public void mostrarDatos(){
        clearScreen.clear();
        imprimirLineaH();
        imprimir("Datos\n");
        imprimir("Nombre: " + getNombre());
        imprimir("Descripción: " + getDescripcion());
        imprimir("Categoria: " + getCategoria());
        imprimir("Precio: " + getPrecio());
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
