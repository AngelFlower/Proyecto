package modelos;

import herramientas.ClearScreen;

import java.util.Scanner;

public class Pantalla {

    ClearScreen clearScreen = new ClearScreen();
    private static final String padding = "      ";
    public static final String ANSI_GREEN = "\u001B[31m";
    static Scanner entrada = new Scanner(System.in);


    public Pantalla() {
        inicioPantalla();
    }

    public void inicioPantalla(){
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
        int entero = -1;
        String valor;
        do {
            try {
                valor = entrada.next();
                entero = Integer.parseInt(valor);
            } catch (NumberFormatException ex) {
                imprimir("Por favor introduce valores enteros");
            }
        }while ( entero == -1 );
        return entero;
    }

    public float leerFloat(){
        return entrada.nextFloat();
    }

    public double leerDouble(){
        return entrada.nextDouble();
    }

    public static String leerString(){
        String s = entrada.nextLine();
        return( s.length() == 0 ? entrada.nextLine() : s );
    }

    public boolean leerBoleano(){
        return entrada.nextBoolean();
    }

    public static String getPadding() {
        return padding;
    }
}
