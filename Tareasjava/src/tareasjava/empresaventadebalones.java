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
public class empresaventadebalones {
    
     /*- En una empresa dedicada a la venta de balones, si se compra uno se hace un descuento de 50%,
         si se compra 2 descuento de 70%, se compra 3 o más se descuenta 80%. Generar la solución que 
         permita leer el número de balones a comprar, el precio de cada balón y el valor final a cancelar.
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);
    int cant;
    double precioUnit, subtotal, total, desc;
    
    System.out.println("Ingrese el número de balones comprados: ");
    cant = entrada.nextInt();
    System.out.printf("Ingrese el precio unitario de cada balón: ");
    precioUnit = entrada.nextDouble();
    
    subtotal = cant * precioUnit;
    if(cant == 1){      
        desc = subtotal * 50/100;
   
    }else{
        if(cant == 2){
            desc = subtotal * 70/100;
            
        }else{   
            desc = subtotal * 80/100;
        }    
    }
    total = subtotal - desc;
   
        
    System.out.printf("\tNúmero de balones a comprar: %d balones\n", cant);
    System.out.printf("\tPrecio de cada balón: %.2f USD\n", precioUnit);
    System.out.printf("\tValor final a cancelar: %.2f USD\n", total);
    }
}
