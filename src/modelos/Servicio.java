package modelos;

public class Servicio extends Pantalla{

    private int codigo;
    private String nombre, descripcion;
    private boolean disponibilidad;

    public Servicio(int codigo, String nombre, String descripcion, boolean disponibilidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.disponibilidad = disponibilidad;
    }

    public Servicio(){
        this.codigo = 0;
        this.nombre = null;
        this.descripcion = null;
        this.disponibilidad = false;
    }

    public void ingresarDatos(){
        imprimir("Ingrese lo que se le pide\n");
        imprimirSinSalto("Código: ");
        setCodigo(leerEntero());
        imprimirSinSalto("Nombre: ");
        setNombre(leerString());
        imprimirSinSalto("Descripción: ");
        setDescripcion(leerString());
        imprimirSinSalto("Disponibilidad (true|false): ");
        setDisponibilidad(leerBoleano());
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

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

}
