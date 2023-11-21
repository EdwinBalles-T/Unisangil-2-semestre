
package tallerpooidentidad;

import java.util.concurrent.ThreadLocalRandom;


 
public class Persona {
    private String nombre;
    private int edad,cedula; 
    private double peso,altura;
    private char sexo;
    double IMC;
    

    public Persona(){
     // this.cedula=CrearCedula();
        nombre=null;
        edad=0;
        peso=0.0;
        altura=0.0;
        sexo='H';
        
    }
    
    public Persona(String nombre, int edad, char sexo){
     //  this.cedula=crearCedula();
       
       this.nombre=nombre;
    	this.edad=edad;
    	this.sexo=comprobarSexo(sexo);
        
      }
   
    public Persona (String nombre,int edad,char sexo,double peso,double altura){
        this.nombre=nombre;
    	this.edad=edad;
    	this.sexo=comprobarSexo(sexo);
        this.peso=peso;
    	this.altura=altura;
        //this.cedula= CrearCedula();
        
        
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
    public void setaltura(double altura){
        
       this.altura=altura;
        
    }
    public void setpeso(double peso){
        
       this.peso=peso;
        
    }
    public void setcedula(int cedula){
        
       this.cedula=cedula;
        
    }
    public int CalcularIMC(){
    int pesoideal=0;
    IMC=peso/(altura*altura);
    
    if(IMC<20){
        
     pesoideal=-1;   
        
    }else if(IMC>19 && IMC<26){
        
     pesoideal=0;   
        
    }else if(IMC>25){
        
    pesoideal=1;
    }
    
    return pesoideal;
    
    
}
    
    public boolean esMayorDeEdad(){
        
        boolean mayor=false;
        
        if(edad>=18){
            
            mayor=true;
        }else{
            
            mayor=false;
        }
        return mayor;
       
    }
    
    private char comprobarSexo(char sexo){
        
        if(sexo=='M'){
            return 'M';
            
        }else{
        return 'H';
    }
         
    }
    /*public int CrearCedula(){
        
        
        int min = 1;
        int max = 8;
      
        for(int i = 1; i <=8; i++) {
        int num = ThreadLocalRandom.current().nextInt(min, max) + min;
       return num;
      
        }
        
    }*/
    
    public String toString(){
        String infopersona;
        infopersona="Nombre: "+nombre+"\nEdad: "+edad+"\nCedula: "+cedula+"\nSexo: "+sexo+"\nPeso: "+peso+" KL"+"\nAltura: "+altura+" m";
     
     return infopersona;
      
     
} 
        
    
  
     
}
       
    
    
 
   
    
    
    

    
    

