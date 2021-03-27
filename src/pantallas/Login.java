package pantallas;

import modelos.Pantalla;

import java.util.Scanner;

public class Login extends Pantalla {
    Scanner teclado = new Scanner(System.in);
    public Login() {
        imprimir("Bienvenido, inicia sesión para continuar \n");
        imprimir("Usuario:");
        imprimir("Contraseña:");
        imprimirLineaH();
    }
}
