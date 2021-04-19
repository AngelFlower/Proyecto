
package pantallas;

import java.util.Scanner;


public class compra {
    public compra (){
         Scanner Leer = new Scanner(System.in);
        System.out.println("Ingrese el nro. de ventas: ");
        int entrada = Leer.nextInt();
        double total_pagar =0;
        char departamento[] = new char[entrada];
        double ventas[][] = new double[entrada][4];
        //Estructura de repeticion
        for (int i = 0; i < entrada; i++) {
            //Entrada de datos
            System.out.println("Seleccione el tipo de producto: Electronicos(E) / Hogar(H) / Abarrotes(A)");
            departamento[i] = Leer.next().charAt(0);
            System.out.println("Ingrese la cantidad de productos: ");
            ventas[i][0] = Leer.nextDouble();
            System.out.println("Ingrese el precio del producto: ");
            ventas[i][1] = Leer.nextDouble();
            //Proceso
            //Condicion de desccuento, dependiendo el numero de compras
            if(ventas[i][0] >= 6) {
                if(departamento[i]=='E') {
                    ventas[i][2]=(ventas[i][0]*ventas[i][1])*0.12;
                }else if(departamento[i]=='H') {
                    ventas[i][2]=(ventas[i][0]*ventas[i][1])*0.08;
                }else {
                    ventas[i][2]=(ventas[i][0]*ventas[i][1])*0.045;
                }
            }else {
                ventas[i][2] = 0;
            }
            //Calcular el monto de pago, junto con el descuento
            ventas[i][3]=(ventas[i][0]*ventas[i][1])-ventas[i][2];
            //Mostrar compra realizada
            System.out.println("***********************************");
            System.out.println("Tipo de producto: "+departamento[i]);
            System.out.println("Cantidad comprada: "+ventas[i][0]);
            System.out.println("Monto del descuento: "+ventas[i][2]);
            System.out.println("Monto de pago: "+ventas[i][3]);
            //Acumular todas las ventas
            total_pagar += ventas[i][3];
        
                
            }
       
        //Mostrar datos de los arreglos | 
        System.out.println("\n");
        System.out.println("************************************************************************************");
        System.out.println("Tipo \t\t" +"Cantidad \t\t" +"Precio\t\t"+"Descuento\t"+" Pago\t");
        for (int i = 0; i < entrada; i++) {
            System.out.println(departamento[i]+" \t\t "+ventas[i][0]+" \t\t\t "+ventas[i][1]+
                    " \t\t "+String.format("%.3f", ventas[i][2])+" \t\t"+String.format("%.3f", ventas[i][3]));
        }
        //Mostrar monto acumulado por todas la ventas
        System.out.println("************************************************************************************");
        System.out.println("Total a pagar: "+total_pagar );
    
    }
}
