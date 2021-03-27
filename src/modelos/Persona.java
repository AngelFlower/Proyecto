package modelos;

public class Persona extends Pantalla{

    private String nombre, apellidos;
    private int edad;

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public Persona() {
        this.nombre = null;
        this.apellidos = null;
        this.edad = 0;
    }

    public void ingresarDatos(){
        imprimir("Ingrese lo que se le pide\n");
        imprimirSinSalto("Nombre: ");
        setNombre(leerString());
        imprimirSinSalto("Apellidos: ");
        setApellidos(leerString());
        imprimirSinSalto("Edad: ");
        setEdad(leerEntero());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
