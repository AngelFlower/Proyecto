package pantallas;

import modelos.Cliente;
import modelos.Pantalla;
import modelos.Producto;
import modelos.Servicio;

public class Alta extends Pantalla{

    Cliente cliente = new Cliente();
    Producto producto = new Producto();
    Servicio servicio = new Servicio();

    private void ui(){
        inicioPantalla();
        imprimir("Escriba el número correspondiente a lo que desea dar de alta\n");
        imprimir("1) Cliente");
        imprimir("2) Producto");
        imprimir("3) Servicio");
        imprimir("4) Regresar al menú");
        imprimirSinSalto("");
        menu(leerEntero());
    }

    public Alta (){
        ui();
    }

    private void menu (int opcion){
        switch (opcion){
            case 1:
                cliente.ingresarDatos();
                cliente.mostrarDatos();
                break;
            case 2:
                producto.ingresarDatos();
                break;
            case 3:
                servicio.ingresarDatos();
                break;
            case 4:
                ui();
                break;
            default:
                imprimir("Opción inválida");
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
