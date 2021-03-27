package modelos;

import herramientas.ClearScreen;

import java.util.Scanner;

public class Pantalla {

    private static final String padding = "      ";
    public static final String ANSI_GREEN = "\u001B[31m";
    static Scanner entrada = new Scanner(System.in);

    public Pantalla() {
        ClearScreen clearScreen = new ClearScreen();
        clearScreen.clear();
        imprimirLineaH();
    }

    public static void imprimir(String texto){
        System.out.println(padding+texto);
    }
    public static void imprimirSinSalto(String texto){
        System.out.print(padding+texto);
    }

    public void imprimirLineaH(){
        System.out.println(ANSI_GREEN+"-------------------------------------------------------------");
    }

    public static int leerEntero(){
        return entrada.nextInt();
    }

    public float leerFloat(){
        return entrada.nextFloat();
    }

    public static String leerString(){
        return entrada.next();
    }

    public static String getPadding() {
        return padding;
    }
}
