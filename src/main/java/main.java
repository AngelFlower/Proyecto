import java.util.Scanner;
import pantallas.Alta;
import pantallas.Consulta;
import pantallas.Login;
import pantallas.Menu;

public class main {

    public static void main(String[] args) {

       // Alta alta = new Alta();

       // Login login = new Login();
        
        
/*
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el numero de la categoria");
        String nombre = entrada.nextLine();
        Consulta con = new Consulta ();
        con.getDatos(nombre);*/
      
       new main();
    }

    public main (){
        new Menu();
        new Alta();
    }
   
}
