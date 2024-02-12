package ventana;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import moldes.Carro;

public class ConducirCarro implements ActionListener{
	
	JFrame ventana;
	JPanel jpdatos, jpmostrar, jpconducir;
	JLabel jltitulo, jlplaca, jlcolor, jlmodelo,jlmarca,jltitulo2,
	jlmotor, jlnivel, jlvelocidad, jlconducir;
	JTextField jtplaca, jtcolor, jtmodelo, jtmarca;
	JButton jbcrear, jbencender, jbapagar, jbacelerar, jbfrenar, jbprender;
	
	Color miColor = new Color(184, 214, 213);
    Color azul2 = new Color(81, 168, 255);
    Color rojo2 = new Color(255,132,132);
    
  //Carro
  	Carro car;
    
	public ConducirCarro() {
		
		ventana= new JFrame();
		ventana.setVisible(true);
		ventana.setTitle("Conducir carro");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLayout(null);
		ventana.setSize(310, 600);
		ventana.setLocationRelativeTo(null);
		iniciarcomponentes();
	    ventana.repaint();
	}
	
	private void iniciarcomponentes() {
		
		jpdatos = new JPanel();
		jpdatos.setBounds(0, 0, 300, 300);// x, y, ancho, alto.
		jpdatos.setBackground(miColor);
		jpdatos.setLayout(null);
		ventana.add(jpdatos);
		
		jpmostrar = new JPanel();
		jpmostrar.setBounds(0, 300, 300, 160);
		jpmostrar.setBackground(azul2);
		jpmostrar.setLayout(null);
		ventana.add(jpmostrar);
		
		jpconducir = new JPanel();
		jpconducir.setBounds(0, 460, 300, 120);
		jpconducir.setBackground(rojo2);
		jpconducir.setLayout(null);
		ventana.add(jpconducir);
			
		//primer panel
		
				jltitulo = new JLabel("Datos Carro");
				jltitulo.setBounds(100, 20 , 100, 20);
				jltitulo.setFont(new Font("Agency FB",Font.PLAIN,25));
				jpdatos.add(jltitulo);
				
				jlplaca = new JLabel("Placa:");
				jlplaca.setBounds(65, 60 , 100, 20);
				jlplaca.setFont(new Font("Agency FB",Font.PLAIN,25));
				jpdatos.add(jlplaca);
				
				jtplaca = new JTextField();
				jtplaca.setBounds(130, 62 , 100, 20);
				jtplaca.setFont(new Font("arial",Font.PLAIN,14));
				jpdatos.add(jtplaca);
				
				jlcolor = new JLabel("color:");
				jlcolor.setBounds(65, 100 , 100, 20);
				jlcolor.setFont(new Font("Agency FB",Font.PLAIN,25));
				jpdatos.add(jlcolor);
				
				jtcolor = new JTextField();
				jtcolor.setBounds(130, 102 , 100, 20);
				jtcolor.setFont(new Font("arial",Font.PLAIN,14));
				jpdatos.add(jtcolor);
					
				jlmodelo = new JLabel("modelo:");
				jlmodelo.setBounds(65, 140 , 100, 20);
				jlmodelo.setFont(new Font("Agency FB",Font.PLAIN,25));
				jpdatos.add(jlmodelo);
				
				jtmodelo = new JTextField();
				jtmodelo.setBounds(130, 142 , 100, 20);
				jtmodelo.setFont(new Font("arial",Font.PLAIN,14));
				jpdatos.add(jtmodelo);
				
				jlmarca = new JLabel("marca:");
				jlmarca.setBounds(65, 180 , 100, 20);
				jlmarca.setFont(new Font("Agency FB",Font.PLAIN,25));
				jpdatos.add(jlmarca);
				
				jtmarca = new JTextField();
				jtmarca.setBounds(130, 182 , 100, 20);
				jtmarca.setFont(new Font("arial",Font.PLAIN,14));
				jpdatos.add(jtmarca);
				
				jbcrear = new JButton("crear");
				jbcrear.setBounds(110, 230,70,30);
				jbcrear.addActionListener(this);
				jpdatos.add(jbcrear);
				
			    //segundo panel
				
				
				jltitulo2 = new JLabel("Estado Carro:");
				jltitulo2.setBounds(55, 20 , 200, 20);
				jltitulo2.setFont(new Font("Agency FB",Font.PLAIN,25));   
				jpmostrar.add(jltitulo2);
				
				jlmotor = new JLabel("Motor:");
				jlmotor.setBounds(55, 53 , 200, 23);
				jlmotor.setFont(new Font("Agency FB",Font.PLAIN,25));
				jpmostrar.add(jlmotor);
				
				jlnivel = new JLabel("Nivel Bateria:");
				jlnivel.setBounds(55, 83 , 200, 23);
				jlnivel.setFont(new Font("Agency FB",Font.PLAIN,25));
				jpmostrar.add(jlnivel);
				
				jlvelocidad = new JLabel("velocidad:");
				jlvelocidad.setBounds(55, 113 , 200, 23);
				jlvelocidad.setFont(new Font("Agency FB",Font.PLAIN,25));
				jpmostrar.add(jlvelocidad);
				
				// Tercer panel
				
				jlconducir = new JLabel("conducir carro");
				jlconducir.setBounds(95, 8 , 130, 20);
				jlconducir.setFont(new Font("Agency FB",Font.PLAIN,25));
				jpconducir.add(jlconducir);
				
			 
				jbprender = new JButton("prender");
				jbprender.setBounds(30, 38 , 85, 27);
				jbprender.addActionListener(this);           //jbprender.addActionListener(new ActionListener(){
				jpconducir.add(jbprender);
				 
				jbapagar = new JButton("apagar");
				jbapagar.setBounds(180, 38 , 85, 27);
				jbapagar.addActionListener(this);  
				jpconducir.add(jbapagar);
		        
				jbacelerar = new JButton("acelerar");
				jbacelerar.setBounds(30, 70 , 85, 27);
				jbacelerar.addActionListener(this);  
				jpconducir.add(jbacelerar);
				 
				jbfrenar = new JButton("frenar");
				jbfrenar.setBounds(180, 70 , 85, 27);
				jbfrenar.addActionListener(this);  
				jpconducir.add(jbfrenar);
				
				 
	}
	
	
	public void actualizar() {
			
		jltitulo2.setText("Estado Carro: "+car.getPlaca());
		
	if(car.getEstadoMotor()) {
		    jlmotor.setText("Motor: ENCENDIDO");
	    }else {
			jlmotor.setText("Motor: APAGADO");
	   }
	jlnivel.setText("Nivel de Batería: "+String.valueOf(car.getNivelBateria())+" %");
    jlvelocidad.setText("Velocidad: "+String.valueOf(car.getVelocidad())+" Kl/h");
	
		}
	

	@Override
	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource()==jbcrear) {
			String pl, cl, marc;
			int mod;
			pl=jtplaca.getText();
			cl=jtcolor.getText();
			marc=jtmarca.getText();
			mod=Integer.parseInt(jtmodelo.getText());
			
			car = new Carro(pl,cl,mod,marc);
			jbcrear.setEnabled(false);
			
			actualizar();			
			
		}
		
		if(evento.getSource()==jbprender) {
			car.encender();
			actualizar();
			jbprender.setEnabled(false);
			jbapagar.setEnabled(true);
		}
		
		if(evento.getSource()==jbapagar) {
			car.apagar();
			actualizar();
			jbprender.setEnabled(true);
			jbapagar.setEnabled(false);
		}  
		
		if(evento.getSource()==jbacelerar) {
			car.acelerar();
			actualizar();
			
		}
		
		if(evento.getSource()==jbfrenar) {
			car.frenar();
			actualizar();
			
		}
	}
}


