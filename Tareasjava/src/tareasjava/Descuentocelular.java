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
public class Descuentocelular {
    
    /*-Una empresa dedicada a vender teléfonos celulares, en base a las siguientes consideraciones:
       - Si el cliente es de tipo 1 se le descuenta 10%
       - Si el cliente es de tipo 2 se le descuenta 20%
       - Si el cliente es de tipo 3 se le descuenta 30%
      La solución debe imprimir el siguiente reporte:
      Nombre: Luis Alvarez
      Tipo de Cliente: 1
      Cantidad de Celulares: 20
      Precio por cada celular: 300
      Subtotal a pagar: cantidad de celulares * precio c/celular
      Descuento: (se debe obtener el descuento)
      Valor final a pagar: Subtotal - Descuento.
      Importante, en base al reporte requerido usted debe analizar el conjunto 
      de datos de entrada necesarios.
    */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int tip, cant;
        double precioUni, subtotal, desc=0, total;
       
        System.out.println("Ingrese el nombre del cliente: ");
        nombre = entrada.nextLine();
        System.out.println("Seleccione el tipo de cliente(1,2,3): ");
        tip = entrada.nextInt();
        System.out.println("Ingrese la cantidad de celulares que compra: ");
        cant = entrada.nextInt();
        System.out.println("Ingrese el valor de cada celular: ");
        precioUni = entrada.nextDouble();
        
        subtotal = cant * precioUni;
        
        
        switch(tip){
            case 1:
                desc = subtotal * 10/100;
                break;
                
            case 2:
                desc = subtotal * 20/100;
                break;
                
            case 3:
                desc = subtotal * 30/100;
                break;
        }
      
        total = subtotal - desc;
        
        
        System.out.printf("\tNombre: %s\n", nombre);
        System.out.printf("\tTipo de Cliente: %d\n", tip);
        System.out.printf("\tCantidad de Celulares: %d celulares\n", cant);
        System.out.printf("\tPrecio por cada celular: %.2f USD\n", precioUni);
        System.out.printf("\tSubtotal a pagar: %.2f USD\n", subtotal);
        System.out.printf("\tDescuento: %.2f USD\n", desc);
        System.out.printf("\tValor final a pagar: %.2f USD\n", total);
    }
    
}
