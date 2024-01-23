/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclofor;

import java.util.Scanner;

/**
 *
 * @author Emilson
 */
public class CicloFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, cantidadRepeticiones, suma=0;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese cuantas repeticiones desea realizar?");
        cantidadRepeticiones=entrada.nextInt();
        
        for (x=1;x<=cantidadRepeticiones;x++){
            System.out.println("El valor de la variable X es: "+x);
            suma=suma+x;
            if (suma>91){
                System.out.println("La sumatoria excede lo permitido, por lo tanto, nos salimos del ciclo");
                break;
            }
        }
        System.out.println("El valor final de la variable suma es: "+suma);
    }
    
}
