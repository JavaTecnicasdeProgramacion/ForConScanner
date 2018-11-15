/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forconclasescanner;

import java.util.Scanner;

/**
 *
 * @author alejandro
 */
public class ForConClaseScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner ingreso = new Scanner (System.in);
        System.out.println("******Cantidad de Veces que imprime por teclado************");
        System.out.println("ingrese el dato: ");
        int dato= ingreso.nextInt();
        System.out.println("usted ha ingresado el numero: "+dato);
        
       for(int a=0;a<dato;a++){
       
           System.out.println("**********************");
       }
        
       
        
        
    }
    
}
