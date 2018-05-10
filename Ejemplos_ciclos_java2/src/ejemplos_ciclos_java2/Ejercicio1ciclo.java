/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos_ciclos_java2;

/**
 *
 * @author Gerson
 */
public class Ejercicio1ciclo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum=0 ;
        int cont=1;
        System.out.printf("%s\t %s\n","contador","suma");
        while( cont<=4){
            sum=sum+cont;
            System.out.printf("%s\t\t%s\n",cont,sum);
            cont=cont+1;
        }     
    
    }
    
    
}

