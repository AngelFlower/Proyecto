
import java.util.Scanner;
import main.java.pantallas.Consulta;

public class main {

    public static void main(String[] args) {

       // Alta alta = new Alta();

       // Login login = new Login();
        
        
//CATEGORIA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el numero de la categoria");
        String nombre = entrada.nextLine();
        Consulta con = new Consulta ();
        con.getDatosCategoria(nombre);
//CLIENTE
    System.out.println("Ingresa el numero del cliente");
         String nombre1 = entrada.nextLine();
         con.getDatosCliente(nombre1);

//PRODUCTO
  System.out.println("Ingresa el numero del producto");
         String nombre2 = entrada.nextLine();
         con.getDatosProducto(nombre2);
    
//SERVICIO
  System.out.println("Ingresa el numero del servicio");
         String nombre3 = entrada.nextLine();
         con.getDatosServicio(nombre3);
     
       new main();
    }

    public main (){
        //new Menu();
        //new Alta();
    }
   
}
