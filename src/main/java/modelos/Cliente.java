package modelos;


public class Cliente extends Persona {

    private String correo;


    public Cliente(String nombre, String apellidos, String correo) {
        super(nombre, apellidos);
        this.correo = correo;
    }

    public Cliente(){
        this.correo = "";
    }

    @Override
    public void ingresarDatos(){
        super.ingresarDatos();
        imprimirSinSalto("Correo: ");
        setCorreo(leerString());
    }

    public void mostrarDatos(){
        clearScreen.clear();
        imprimirLineaH();
        imprimir("Datos\n");
        imprimir("Correo: " + getCorreo());
        imprimir("Nombre: " + getNombre());
        imprimir("Apellidos: " + getApellidos());
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
