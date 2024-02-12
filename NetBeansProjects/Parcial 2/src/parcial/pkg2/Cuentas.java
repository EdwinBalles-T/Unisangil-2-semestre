/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial.pkg2;

/**
 *
 * @author Edwin ballesteros
 */
public class Cuentas {
    
    private String nombre; 
    private int edad;
    private int cedula;
    private char sexo;
    private int clave;
    
    public Cuentas(){
        nombre=null;
        edad=0;  
        cedula=0;
        sexo='H';
        
    
    }
    
    public Cuentas (String nombre,int edad,int cedula,char sexo,int clave){
        this.nombre=nombre;
    	this.edad=edad;
        this.cedula=cedula;
    	this.sexo=sexo;
        this.clave=clave;
        
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
    public void setcedula(int cedula){
        
       this.cedula=cedula;
        
    }
     public void setclave(int clave){
        
       this.clave=clave;
        
    }
    
     
     public String toString(){
        String infopersona;
        infopersona="Nombre: "+nombre+"\nEdad: "+edad+"\nSexo: "+sexo+"\nTarjeta: "+cedula+"\nclave: "+clave;
     
     return infopersona;
    
     }
    
    
    
    
    
}
