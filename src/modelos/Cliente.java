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

    public void ingresarDatos(){
        super.ingresarDatos();
        imprimirSinSalto("Código: ");
        setCodigo(leerEntero());
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
