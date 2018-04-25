/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareasjava;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author Gerson Santos
 */
public class valoresdeXyY {
    
     /*-Solución que permita calcular y presentar los valores de X y Y,
       teniendo como dato de entrada el valor de X y obtener el de Y en base 
       a las siguientes restricciones:
       Si X<0 entonces Y=3*X+10
       Si X>0 entonces Y=X**2+6
       Si X==0 entonces Y=1
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
    
    double x, y;
    
    System.out.println("Ingrese el valor de x: ");
    x = entrada.nextDouble();
  
    if(x < 0){
        y = (3* x +10);
        
    }else{
        if(x > 0){
            y = (pow(x,2)+6); //
        }else{
            y = 1;
        }
    }
    
    System.out.println("El valor de y es igual a: "+y);
    
    }
    
}
