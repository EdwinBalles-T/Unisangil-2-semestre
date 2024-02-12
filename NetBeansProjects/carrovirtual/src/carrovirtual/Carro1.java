/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrovirtual;
import javax.swing.JOptionPane;
 
/**
 *
 * @author Edwin ballesteros
 */
public class Carro1 {
    
    private String placa;
	private String color;
	private int modelo;
	private String marca;
	
	private boolean estadoMotor;
	private int nivelBateria;
	private int velocidad;
	
	public Carro1() {
		estadoMotor=false;
		nivelBateria=100;
		velocidad=0;
	}
        
	public Carro1(String placa, String color, int modelo, String marca) {
		this.placa=placa;
		this.color=color;
		this.modelo=modelo;
		this.marca=marca;
		estadoMotor=false;
		nivelBateria=100;
		velocidad=0;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setModelo(int  modelo) {
		this.modelo = modelo;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPlaca(){
		return this.placa;
	}
	public String getColor() {
		return this.color;
	}
	public int getModelo() {
		return this.modelo;
	}
	public String getMarca() {
		return this.marca;
	}
	public boolean getEstadoMotor() {
		return this.estadoMotor;
	}
	public int getNivelBateria() {
		return this.nivelBateria;
	}
	public int getVelocidad() {
		return this.velocidad;
	}
	
        
        
	public void encender() {
		
		this.estadoMotor=true;
		this.nivelBateria -= 5;
		
	}	 
	public void apagar() {
		
		this.estadoMotor=false;
		this.nivelBateria = 100;
		this.velocidad=0;
	
		
	}
	
	public void acelerar() {	
            if(nivelBateria>=0){
		if(estadoMotor) {
			if (velocidad<150) {
				if(nivelBateria>10) {
					nivelBateria -=2;
					velocidad +=10;
					if(velocidad>150) {
						velocidad=150;
					}
				}else {
					nivelBateria -=2;
					velocidad +=10;
					JOptionPane.showMessageDialog(null, "Nivel de batería bajo");
				}
			}else {
				JOptionPane.showMessageDialog(null,"Límite máximo de velocidad");
			}
		}else {
			JOptionPane.showMessageDialog(null, "Encender el carro primero",null,2);
		}
        }else{
                JOptionPane.showMessageDialog(null,"Bateria agotada",null,1);
            }
          
	}

	
	public void frenar() {
		
	     this.estadoMotor=true;
            
   
             if(nivelBateria >=0){   
             if(velocidad>0 ) {   
                if(nivelBateria>10) {
			nivelBateria -=5;
		        velocidad -=10;
		if(velocidad>150) {
			velocidad=150;
			}
		}else {
			nivelBateria -=2;
			velocidad -=10;
			JOptionPane.showMessageDialog(null, "Nivel de batería bajo",null,2);
				}
               
	    }else {
		JOptionPane.showMessageDialog(null,"El vehiculo esta en reposo",null,2);
      }
        }else{
                JOptionPane.showMessageDialog(null,"Bateria agotada",null,1); 
             }
             
        }
             
  }
	
    
    
   
