/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos_ciclos_java2;
import java.util.Scanner;
/**
 *
 * @author Gerson
 */
public class Ejercicio2ciclo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cadena_final="";
        int sum=0 ;
        int edad=0;
        int cont=1;
        cadena_final =String.format("%s\t %s\n","Edad","Suma");
        while(cont<=5){ 
            System.out.println("Ingrese la edad");
            edad = entrada.nextInt();
            sum=sum+edad;
            cont=cont+1;
            cadena_final= String.format("%s%d\t%d\n",cadena_final,edad,sum);
        }
           
            System.out.printf("%s",cadena_final);
    }
    
}
