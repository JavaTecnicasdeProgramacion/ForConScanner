
package juegorol;

import java.util.Random;


public class participantes {
   private String Nombre ;
   private int vida = 100;
   private int minPower = 0;
   private int fuerza;
    
    
 public String getNombre() {
        return Nombre;
        
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getVida() {
        return vida;
    }

    public int getMinPower() {
        return minPower;
    }

    public int getMaxPower() {
        return fuerza;
    }

    public void setMaxPower(int fuerza) {
        this.fuerza = fuerza;
    }
    public int atacar(){
     Random rnd = new Random();    
       int dañoTotal= 0;
       dañoTotal = this.fuerza *rnd.nextInt(20);
        return dañoTotal;
    }
   public void dañoRecibido(int dañoRecibido){
       this.vida = this.vida- dañoRecibido;
       if(this.vida <=0){
           System.out.println("el participante ha sido derrotado");
       }
      
         
      
       }
       }
       
       
   
  
   

