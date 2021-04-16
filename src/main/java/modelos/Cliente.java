package modelos;


public class Cliente extends Persona {

    private String correo;
    private int codigo;

    public Cliente(String nombre, String apellidos, String correo, int codigo) {
        super(nombre, apellidos);
        this.correo = correo;
        this.codigo = codigo;
    }

    public Cliente(){
        this.correo = "";
        this.codigo = 0;
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
