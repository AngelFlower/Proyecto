package pantallas;

import modelos.Cliente;
import modelos.Pantalla;
import static modelos.Pantalla.imprimir;
import modelos.Producto;
import modelos.Servicio;

public class Baja extends Pantalla{
    
     Cliente cliente = new Cliente();
     Producto producto = new Producto();
     Servicio servicio = new Servicio();
    
     public Baja (){
       // imprimir ("Estas en Bajas");
        inicioPantalla();
        imprimir("Escriba el número correspondiente a lo que desea dar de baja\n");
        imprimir("1) Cliente");
        imprimir("2) Producto");
        imprimir("3) Servicio");
        imprimir("4) Regresar al menú");
        imprimirSinSalto("");
        menu(leerEntero());  
        
       }

  
 private void menu (int opcion){
        switch (opcion){
            case 1:
               cliente.setCodigo(leerEntero());
                bajaCliente();
                break;
            case 2:
               producto.setCodigo(leerEntero());
                break;
            case 3:
                servicio.setCodigo(leerEntero());
                break;
            case 4:
              new Menu ();
                break;
            default:
              imprimir("Opción inválida");
       }    
 }
 
   public void bajaProducto(){

    }
    public void bajaServicio(){
        secuenciaSQL();
    }
    public void bajaCliente(){
        System.out.println(cliente.getCorreo());
        Menu.getBd().ejecutarSentenciaSQL(
                 "DELETE FROM `cliente` WHERE Id_cliente = ‘“ + cliente.getcodigo()+”’");
    }

    private void secuenciaSQL(){
        System.out.println("Simulación de SQL");
    }
  
 }