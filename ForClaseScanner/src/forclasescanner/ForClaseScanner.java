/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forclasescanner;

import java.util.Scanner;
/**
 *
 * @author alejandro
 */
public class ForClaseScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ingreso = new Scanner (System.in);
        System.out.println("****************************************");
        System.out.println("ingrese el dato: ");
        int dato= ingreso.nextInt();
        System.out.println("usted ha ingresado el numero: "+dato);
        
        funcionpedidoscanner(dato);//funcion que utiliza el dato por teclado
        
        System.out.println("****************************************");
        System.out.println("********Funcion con Clase Scanner dentro**************");
        
       funcionpedidoscanner();//llama directo a la funcion
    }
    
    
    public static void funcionpedidoscanner(int datoingresado){
    
        System.out.println("usted ha ingresado el dato por teclado: " + datoingresado);
    
    
    }
    
    //dentro de la funcion esta la clase scanner
    public static void funcionpedidoscanner(){
        
        Scanner ingreso = new Scanner(System.in);
        
        System.out.println("ingrese el dato 2: ");
        System.out.println("ingrese el dato: ");
        int dato= ingreso.nextInt();
        System.out.println("usted ha ingresado el numero: "+dato);
        
        System.out.println("usted ha ingresado el dato por teclado: " + dato);
    
    
    }
    
}
