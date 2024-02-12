package iniciacion;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Calculadora extends JFrame implements ActionListener {
	
	JPanel conte;
	JLabel jlmarca;
	JTextField jtpantalla;
	JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9, 
	jb0, jbsuma, jbresta, jbmulti, jbdiv, jbAC, jbC, jbpunto, jbigual;
	
	Color miColor = new Color(184, 214, 213);
	
	public Calculadora(){
		
		this.setVisible(true);
		this.setSize(365,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setTitle("Calculadora");
	    iniciarOperacion();
	}
	
	public void iniciarOperacion() {
		conte = new JPanel();
	    conte.setBackground(miColor);
	    conte.setLocation(50, 50);
	    conte.setSize(300, 100);
	    conte.setLayout(null);
	    this.setContentPane(conte);
	    
	    jlmarca = new JLabel();
	    jlmarca.setText("RADIO");
	    jlmarca.setBounds(25,120,200,34);   // x, y, ancho, alto.
	    jlmarca.setFont(new Font("Baskerville Old Face",Font.BOLD,30));
	    jlmarca.setForeground(Color.RED);
	    conte.add(jlmarca);
	    
	    jtpantalla = new JTextField();
	    jtpantalla.setBounds(16, 40, 318, 60);
	    jtpantalla.setFont(new Font("Agency FB",Font.BOLD,34));
	    conte.add(jtpantalla);
	
	    jbAC = new JButton("AC");
	    jbAC.setBounds(190, 120, 52, 30);
	    jbAC.addActionListener(this);
	    conte.add(jbAC);
	    
	    jbC = new JButton("C");
	    jbC.setBounds(272, 120, 50, 30);
	    jbC.addActionListener(this);
	    conte.add(jbC);
	    
	    
	    jb1 = new JButton("1");
	    jb1.setBounds(25, 310, 50, 30);
	    jb1.addActionListener(this);
	    conte.add(jb1);
	    
	    jb2 = new JButton("2");
	    jb2.setBounds(108, 310, 50, 30);
	    jb2.addActionListener(this);
	    conte.add(jb2);  
	    
	    jb3 = new JButton("3");
	    jb3.setBounds(190, 310, 50, 30);
	    jb3.addActionListener(this);
	    conte.add(jb3);
	    
	    jb4 = new JButton("4");
	    jb4.setBounds(25, 250, 50, 30);
	    jb4.addActionListener(this);
	    conte.add(jb4); 
	    
	    jb5 = new JButton("5");
	    jb5.setBounds(108, 250, 50, 30);
	    jb5.addActionListener(this);
	    conte.add(jb5);
	    
	    jb6 = new JButton("6");
	    jb6.setBounds(190, 250, 50, 30);
	    jb6.addActionListener(this);
	    conte.add(jb6);
	    
	    jb7 = new JButton("7");
	    jb7.setBounds(25, 190, 50, 30);
	    jb7.addActionListener(this);
	    conte.add(jb7);
	    
	    jb8 = new JButton("8");
	    jb8.setBounds(108, 190, 50, 30);
	    jb8.addActionListener(this);
	    conte.add(jb8); 
	    
	    jb9 = new JButton("9");
	    jb9.setBounds(190, 190, 50, 30);
	    jb9.addActionListener(this);
	    conte.add(jb9);
	    
	    jb0 = new JButton("0");
	    jb0.setBounds(25, 370, 50, 30);
	    jb0.addActionListener(this);
	    conte.add(jb0); 
	    
	    jbsuma = new JButton("+");
	    jbsuma.setBounds(272, 190, 50, 30);
	    jbsuma.addActionListener(this);
	    conte.add(jbsuma);
	    
	    jbresta = new JButton("-");
	    jbresta.setBounds(272, 250, 50, 30);
	    jbresta.addActionListener(this);
	    conte.add(jbresta);  
	    
	    jbmulti = new JButton("x");
	    jbmulti.setBounds(272, 310, 50, 30);  
	    jbmulti.addActionListener(this);
	    conte.add(jbmulti);
	    
	    jbdiv = new JButton("%");
	    jbdiv.setBounds(272, 370, 50, 30);
	    jbdiv.addActionListener(this);
	    conte.add(jbdiv); 
	    
	    jbpunto = new JButton(".");
	    jbpunto.setBounds(108, 370, 50, 30);
	    jbpunto.addActionListener(this);
	    conte.add(jbpunto);
	    
	    jbigual = new JButton("=");
	    jbigual.setBounds(190, 370, 50, 30);
	    jbigual.addActionListener(this);
	    conte.add(jbigual);
	    
	    
	    repaint();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	  
		if(e.getSource()==jb1) {
			
		 if(jtpantalla.getText() == "") {
			 
			 jtpantalla.setText("1");
			
		}else {
			
			jtpantalla.setText(jtpantalla.getText()+"1");
		   
		    }
		}
			
		      if(e.getSource()==jb2) {
				 
				if(jtpantalla.getText() == "") {
					 
					 jtpantalla.setText("2");
					
				}else {
					
					jtpantalla.setText(jtpantalla.getText()+"2");
				}
			}
			
			if(e.getSource()==jb3) {
				 
				if(jtpantalla.getText() == "") {
					 
					 jtpantalla.setText("3");
					
				}else {
					
					jtpantalla.setText(jtpantalla.getText()+"3");
				}
			}
			
			if(e.getSource()==jb4) {
				  
				if(jtpantalla.getText() == "") {
					 
					 jtpantalla.setText("4");
					
				}else {
					
					jtpantalla.setText(jtpantalla.getText()+"4");
				}
			}
				
			if(e.getSource()==jb5) {
					
				if(jtpantalla.getText() == "") {
					 
					 jtpantalla.setText("5");
					
				}else {
					
					jtpantalla.setText(jtpantalla.getText()+"5");
				}
			 
			}	 
					
			if(e.getSource()==jb6) {
						 
				if(jtpantalla.getText() == "") {
					 
					 jtpantalla.setText("6");
					
				}else {
					
					jtpantalla.setText(jtpantalla.getText()+"6");
				}
			 
	        }			
			
			if(e.getSource()==jb7) {
						 
				if(jtpantalla.getText() == "") {
					 
					 jtpantalla.setText("7");
					
				}else {
					
					jtpantalla.setText(jtpantalla.getText()+"7");
				
				}		
			}
					
			if(e.getSource()==jb8) {
						  
				if(jtpantalla.getText() == "") {
					 
					 jtpantalla.setText("8");
					
				}else {
					
					jtpantalla.setText(jtpantalla.getText()+"8");
			 
				}		
			}
						
			if(e.getSource()==jb9) {
							 
				if(jtpantalla.getText() == "") {
					 
					 jtpantalla.setText("9");
					
				}else {
					
					jtpantalla.setText(jtpantalla.getText()+"9");
			 
				}			
			}
					
			if(e.getSource()==jb0) {
							  
				if(jtpantalla.getText() == "") {
					 
					 jtpantalla.setText("0");
					
				}else {
					
					jtpantalla.setText(jtpantalla.getText()+"0");
			 
				}
			}
					
			if(e.getSource()==jbpunto) {
						 
				if(jtpantalla.getText() == "") {
					 
					 jtpantalla.setText(".");
					
				}else {
					
					jtpantalla.setText(jtpantalla.getText()+".");
			 
				}	
		    }
				    
			if(e.getSource()==jbsuma) {
						  
				if(jtpantalla.getText() == "") {
					 
					 jtpantalla.setText("+");
					
				}else {
					
					jtpantalla.setText(jtpantalla.getText()+"+");
			 
				}    
			}
					
		    if(e.getSource()==jbresta) {
						  
		    	if(jtpantalla.getText() == "") {
					 
					 jtpantalla.setText("-");
					
				}else {
					
					jtpantalla.setText(jtpantalla.getText()+"-");
		    
				}   
		    }
				
	        if(e.getSource()==jbmulti) {
					 
	        	if(jtpantalla.getText() == "") {
					 
					 jtpantalla.setText("x");
					
				}else {
					
					jtpantalla.setText(jtpantalla.getText()+"x");
			 
				}	
		    }
			       
	        if(e.getSource()==jbdiv) {
					  
	        	if(jtpantalla.getText() == "") {
					 
					 jtpantalla.setText("%");
					
				}else {
					
					jtpantalla.setText(jtpantalla.getText()+"%");
		     
				}  
	        }
	        
	        if(e.getSource()==jbAC) {
				  
		    jtpantalla.setText("");
		     	        
		    }
	        
	        if(e.getSource()==jbC) {
	        	
	        	if(jtpantalla.getText().length() !=0) {
				  
			    jtpantalla.setText(jtpantalla.getText().substring(0, jtpantalla.getText().length()-1));
	        	
	        	   }	        
			    }
	       
	 //Algoritmo Igual      
	       
	        if(e.getSource()==jbigual) {
				  
			    String cadena = jtpantalla.getText();
			    
			    
		  for (int i=0; i<cadena.length(); i++) {
			  
			  char caracter = cadena.charAt(i);
			  
			  if (caracter == '+') {
				  
				  String Parte1 = cadena.substring(0,i);
				  String Parte2 = cadena.substring(i+1,cadena.length());
				  
				  double resultado = Double.parseDouble(Parte1) + Double.parseDouble(Parte2);
				  
				  jtpantalla.setText(Double.toString(resultado));
				  
			  }
			  
              if (caracter == '-') {
				  
				  String Parte1 = cadena.substring(0,i);
				  String Parte2 = cadena.substring(i+1,cadena.length());
				  
				  double resultado = Double.parseDouble(Parte1) - Double.parseDouble(Parte2);
				  
				  jtpantalla.setText(Double.toString(resultado));
				  
			  }
              
              if (caracter == 'x') {
				  
				  String Parte1 = cadena.substring(0,i);
				  String Parte2 = cadena.substring(i+1,cadena.length());
				  
				  double resultado = Double.parseDouble(Parte1) * Double.parseDouble(Parte2);
				  
				  jtpantalla.setText(Double.toString(resultado));
				  
			  }
              
              if (caracter == '%') {
				  
				  String Parte1 = cadena.substring(0,i);
				  String Parte2 = cadena.substring(i+1,cadena.length());
				  
				double cero= Double.parseDouble(Parte2);
				if(cero==0) {
					
			    jtpantalla.setText("Syntax Error");
					
					
				} else {
					
					 double resultado = Double.parseDouble(Parte1) / Double.parseDouble(Parte2);
				  
				  jtpantalla.setText(Double.toString(resultado));
				}
				   
				  
			 }
		  }
			     	        
       }
					 
	}
				
}
		
	
	
	
 

	
	
	
	
	
	


