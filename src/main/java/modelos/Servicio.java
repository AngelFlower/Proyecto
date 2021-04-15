package modelos;

public class Servicio extends Pantalla{

    private int codigo;
    private String nombre, descripcion;
    private double precio;

    public Servicio(int codigo, String nombre, String descripcion, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Servicio(){
        this.codigo = 0;
        this.nombre = null;
        this.descripcion = null;
        this.precio = 0;
    }

    public void ingresarDatos(){
        imprimir("Ingrese lo que se le pide\n");
        imprimirSinSalto("Nombre: ");
        setNombre(leerString());
        imprimirSinSalto("Descripción: ");
        setDescripcion(leerString());
        imprimirSinSalto("Precio: ");
        setPrecio(leerDouble());
    }

    public void mostrarDatos(){
        clearScreen.clear();
        imprimirLineaH();
        imprimir("Datos\n");
        imprimir("Nombre: " + getNombre());
        imprimir("Descripción: " + getDescripcion());
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
