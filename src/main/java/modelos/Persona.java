package modelos;

public class Persona extends Pantalla{

    private String nombre, apellidos;

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Persona() {
        this.nombre = null;
        this.apellidos = null;
    }

    public void ingresarDatos(){
        clearScreen.clear();
        imprimirLineaH();
        imprimir("Ingrese lo que se le pide\n");
        imprimirSinSalto("Nombre: ");
        setNombre(leerString());
        imprimirSinSalto("Apellidos: ");
        setApellidos(leerString());
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

}
