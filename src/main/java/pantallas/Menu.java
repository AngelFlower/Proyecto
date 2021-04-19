package pantallas;

import bd.BD;
import modelos.Pantalla;

public class Menu extends Pantalla{

    private static BD bd = new BD();
     public static BD getBd() {
        return bd; 
        
    }
  
    public Menu() {
        inicioPantalla();
        imprimir("Escriba el número correspondiente a lo que desea realizar\n");
        imprimir("1) Altas ");
        imprimir("2) Bajas");
        imprimir("3) Consulta");
        imprimir("4) Compra");
        imprimir("5) Salir");
        imprimirSinSalto("");
        menu(leerEntero());
    }

    private void menu(int opcion) {
           switch (opcion){
            case 1:
                new Alta();
                break;
            case 2:
                new Baja ();
                break;
            case 3:
          new Consulta ();
                break;
            case 4:
              new compra();
                break;
            case 5: 
                imprimir ("Usted ha salido Exitosamente del programa");
                break;
            default:
                imprimir("Opción inválida");
        }
    } 
}  
               
   



