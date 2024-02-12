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

public class Operaciones extends JFrame implements ActionListener {
	JPanel cont;
	JLabel jltitulo, jlnum1, jlnum2, jlsalida;
    JTextField jtnum1, jtnum2 ;
	JButton jbsuma, jbresta, jbmulti, jbdivi;
	
	Color miColor = new Color(28, 207, 227);
	Color colorDos = new Color(140, 0, 0);
	Color colorTres = new Color (0, 81, 40);
	
	public Operaciones() {
		this.setVisible(true);
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setTitle("Operaciones Basicas");
		iniciarVariables();
	}
		
		public void iniciarVariables() {
			cont = new JPanel();
		    cont.setBackground(miColor);
		    cont.setLocation(50, 50);
		    cont.setSize(300, 100);
		    cont.setLayout(null);
		    this.setContentPane(cont);
		    
		    jltitulo = new JLabel();
		    jltitulo.setText("OPERACIONES");
		    jltitulo.setBounds(182,10,200,20);   // x, y, ancho, alto.
		    jltitulo.setFont(new Font("Baskerville Old Face",Font.BOLD,16));
		    jltitulo.setForeground(colorDos);
		    cont.add(jltitulo);
		
		    jlnum1 = new JLabel("Numero 1:");
		    jlnum1.setBounds(130, 40 , 100, 20);
		    jlnum1.setFont(new Font("Baskerville Old Face",Font.BOLD,14));
		    jlnum1.setForeground(colorTres);
		    cont.add(jlnum1);
		    
		    jtnum1 = new JTextField();
		    jtnum1.setBounds(205, 40, 150, 20);
		    cont.add(jtnum1);
		    
		    jlnum2 = new JLabel("Numero 2:");
		    jlnum2.setBounds(130, 80 , 100, 20);
		    jlnum2.setFont(new Font("Baskerville Old Face",Font.BOLD,14));
		    jlnum2.setForeground(colorTres);
		    cont.add(jlnum2);
		    
		    jtnum2 = new JTextField();
		    jtnum2.setBounds(205, 80, 150, 20);
		    cont.add(jtnum2);
		    
		    jbsuma = new JButton("Suma");
		    jbsuma.setBounds(10, 135, 110, 30);
		    jbsuma.addActionListener(this);
		    cont.add(jbsuma);
		    
		    jbresta = new JButton("Resta");
		    jbresta.setBounds(125, 135, 110, 30);
		    jbresta.addActionListener(this);
		    cont.add(jbresta);  
		      
		    jbmulti = new JButton("Multiplicación");
		    jbmulti.setBounds(241, 135, 120, 30);
		    jbmulti.addActionListener(this);
		    cont.add(jbmulti);
		    
		    jbdivi = new JButton("División");
		    jbdivi.setBounds(367, 135, 110, 30);
		    jbdivi.addActionListener(this);
		    cont.add(jbdivi);
		    
		    jlsalida = new JLabel();
		    jlsalida.setBounds(-5, 195, 500, 26);
		    jlsalida.setHorizontalAlignment(JLabel.CENTER);

	        jlsalida.setFont(new Font("Agency FB",Font.BOLD,25));
		    jlsalida.setForeground(Color.BLUE);
		    cont.add(jlsalida);
		    
		    repaint();
		}

		@Override
		public void actionPerformed(ActionEvent evento) {
			double numero1=Double.parseDouble(jtnum1.getText()) ; 
			double numero2=Double.parseDouble(jtnum2.getText());
			double resultado;
			
			if(evento.getSource()==jbsuma) {
				
			resultado=(numero1+numero2);
			jlsalida.setText("La suma es: "+resultado);
			
			}
			if(evento.getSource()==jbresta) {
				resultado=(numero1-numero2);
				jlsalida.setText("La resta es: "+resultado);
				
			}
			if(evento.getSource()==jbmulti) {
				resultado=(numero1*numero2);
				jlsalida.setText("La multiplicacion es: "+resultado);
				
			}
			if(evento.getSource()==jbdivi) {
				
				if(numero2 == 0) {
					
					jlsalida.setText("No es posible dividir por 0");
				}
				 resultado=(numero1/numero2);
				jlsalida.setText("La division es: "+resultado);
					
			}
			
			jtnum1.setText("0");
			jtnum2.setText("0");
			
		}
	
	
}

