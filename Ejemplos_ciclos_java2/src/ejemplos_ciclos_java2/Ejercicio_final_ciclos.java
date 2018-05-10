/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos_ciclos_java;

import java.util.Scanner;
/**
 *
 * @author Gerson
 */
public class Ejercicio_final_ciclos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String fin="";
        double estatura;
        int cont = 0;
        double sum = 0;
        double prom = 0;
        boolean estaturas = true;
        
        
        fin =String.format("%s\n","Estatura estudiante");

        while (estaturas){
            System.out.printf("Ingrese la estatura del estudiante %d\n", cont);
            estatura = entrada.nextDouble();
            
            if(estatura<1.20){
                estatura = 1.20;
            }
            sum=sum+estatura;
            fin= String.format("%s\n%.2f",fin,estatura);    
            
            cont = cont + 1;
            entrada.nextLine();
            System.out.println("Desea ingresar más estaturas? no (salir)");
            String temporal = entrada.nextLine();
            if(temporal.equals("no")){
                estaturas = false;
            }
        }
        prom = sum/cont;
        System.out.println("Reporte de estaturas:\n");
        System.out.printf("%s\n",fin);
        System.out.printf("Promedio de estaturas:%.2f\nReporte generado por Dep. Deportes\n ", prom);
    }
}
