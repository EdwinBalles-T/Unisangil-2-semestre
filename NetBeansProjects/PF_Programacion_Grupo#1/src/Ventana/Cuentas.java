
package Ventana;

import javax.swing.JOptionPane;
import java.util.concurrent.ThreadLocalRandom;

public class Cuentas{
    
    private String nombre; 
    private int edad;
    private static int tarjeta;
    private char sexo;
    private int contra;
    int saldo=1000000;
   
     public Cuentas(){
        nombre=null;
        edad=0;  
        tarjeta=0;
        sexo='H';
       
    
    }
    
    public Cuentas (String nombre,int edad,int tarjeta,char sexo){
        this.nombre=nombre;
    	this.edad=edad;
        this.tarjeta=tarjeta;
    	this.sexo=sexo;
        
        
    }
     //codigo para enviar un registro a otra clase #1
      
    public Cuentas (int contra){
        this.contra=contra;  
    }
    
    
      public void setNombre(String nombre){
        
       this.nombre=nombre;
        
    }
     public void setEdad(int edad){
        
       this.edad=edad;
        
    }
    public void setsexo(char sexo){
        
       this.sexo=sexo;
        
    }
    public void setTarjeta(int tarjeta){
        
       this.tarjeta=tarjeta;
        
    } 
     public void setcontra(int contra){
         
         this.contra=contra;
     }
     
     //getter--------------------------------------
     
     public String getNombre() {
        return nombre;
    }
     
     public int getEdad() {
        return edad;
    }
     
     public int getTarjeta() {
        return tarjeta;
    }
     public char getSexo() {
        return sexo;
    }
     public int getContra() {
        return contra;
    }
     
     //metodos------------------------------------------
     public int tarjetaclave(){
        int num=0;
 
        if (tarjeta==contra){
           num=1; 
            
        }else{
            num=2;
        }  
        return num;
     }
     
   
     public String toString(){
        String infopersona;
        infopersona="Nombre: "+nombre+"\nEdad: "+edad+"\nSexo: "+sexo+"\nTarjeta: "+tarjeta;
       
     return infopersona;
    
     }
     
     public String toString(int tarjeta){
         String tarclave;
         tarclave="su tarjeta clave es: "+this.tarjeta;
         return tarclave;
         
     }
     public String nombre(){
        String llamado;
        if(this.nombre!=null){
            llamado=nombre;
        }else{
            llamado="edwin";
        }
        return llamado;
     } 
     
     
}
