/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareasjava;

import java.util.Scanner;

/**
 *
 * @author Gerson Santos
 */
public class Númerodía {
 /* Una solución que permia leer el número de día (un valor entre 1 y 7) e 
    imprima Lunes si es 1, Martes si es 2, ... , Domingo si es 7. 

 */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // TODO code application logic here
        int num ;
        System.out.println("Ingrese un número de día:");
         num = entrada.nextInt();
        switch(num){
            case 1:
                System.out.printf("Lunes");
                break;
            
            case 2:
                System.out.printf("Martes");
                break;    
            
            case 3:
                System.out.printf("Miercóles");
                break;
                
            case 4:
                System.out.printf("Jueves");
                break;
                
            case 5:
                System.out.printf("Viernes");
                break;
                
            case 6:
                System.out.printf("Sábado");
                break;
            case 7:
                System.out.printf("Domingo");
                break;   
            default:
                System.out.println("número erróneo");
        }        
                
    }
    
}
