package modelos;

public class Cliente extends Persona {

    private int codigo;

    public Cliente(String nombre, String apellidos, int edad, int codigo) {
        super(nombre, apellidos, edad);
        this.codigo = codigo;
    }

    public Cliente(){
        this.codigo = 0;
    }

    @Override
    public void ingresarDatos(){
        super.ingresarDatos();
        imprimirSinSalto("Código: ");
        setCodigo(leerEntero());
    }

    public void mostrarDatos(){
        clearScreen.clear();
        imprimirLineaH();
        imprimir("Datos\n");
        imprimir("Código: " + getCodigo());
        imprimir("Nombre: " + getNombre());
        imprimir("Apellidos: " + getApellidos());
        imprimir("Edad: " + getEdad());
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
