package pantallas;

import modelos.Cliente;
import modelos.Pantalla;

public class Alta extends Pantalla{

    private void ui(){
        imprimir("Escriba el número correspondiente a lo que desea dar de alta\n");
        imprimir("1) Cliente");
        imprimir("2) Producto");
        imprimir("3) Servicio");
        imprimir("4) Regresar al menú");
        menu(leerEntero());
    }

    public Alta (){
        ui();
    }

    private void menu (int opcion){
        switch (opcion){
            case 1:
                Cliente cliente = new Cliente();
                cliente.ingresarDatos();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:

        }
    }

    public void altaProducto(){ secuenciaSQL(); }
    public void altaServicio(){
        secuenciaSQL();
    }
    public void altaCliente(){
        secuenciaSQL();
    }

    private void secuenciaSQL(){
        System.out.println("Simulación de SQL");
    }

}
