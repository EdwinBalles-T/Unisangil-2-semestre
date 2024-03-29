package ventanas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Saludo extends JFrame implements ActionListener{
	
	//constructor
	//  no retorna valores - se llama igual que la clase    
	
	JPanel contenedor;
	JLabel jltitulo, jlnombre, jlsalida;
	JTextField jtnombre;
	JButton jbsaludar;
	
	public Saludo() {
		this.setVisible(true);
		this.setSize(400,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setTitle("Ventana Saludo");
		iniciarComponentes();
		
	}
   //metodo de accion
	public void iniciarComponentes() {
		contenedor = new JPanel();
	    contenedor.setBackground(Color.ORANGE);
	    contenedor.setLocation(50, 50);
	    contenedor.setSize(300, 100);
	    contenedor.setLayout(null);
	    this.setContentPane(contenedor);
	   // this.add(contenedor);
	    
	    
	    jltitulo = new JLabel();
	    jltitulo.setText("SALUDO");
	    jltitulo.setBounds(158,10,100,20);   // x, y, ancho, alto.
	    jltitulo.setFont(new Font("Baskerville Old Face",Font.BOLD,16));
	    contenedor.add(jltitulo);
	     
	    
	    jlnombre = new JLabel("Nombre:");
	    jlnombre.setBounds(89, 40 , 100, 20);
	    jlnombre.setFont(new Font("Baskerville Old Face",Font.BOLD,14));
	    contenedor.add(jlnombre);
	    
	    jtnombre = new JTextField();
	    jtnombre.setBounds(150, 40, 150, 20);
	    contenedor.add(jtnombre);
	    
	    jbsaludar = new JButton("saludar");
	    jbsaludar.setBounds(145, 80, 100, 30);
	    jbsaludar.addActionListener(this);
	    contenedor.add(jbsaludar);
	    
	    jlsalida = new JLabel("Bienvenido");
	    jlsalida.setBounds(-5, 120, 400, 20);
	    jlsalida.setHorizontalAlignment(JLabel.CENTER);

        jlsalida.setFont(new Font("Agency FB",Font.BOLD,25));
	    jlsalida.setForeground(Color.BLUE);
	    contenedor.add(jlsalida);
	    
	    repaint();
	}
@Override
public void actionPerformed(ActionEvent e) {  //publico, valor retorno, (parametros)
	String nombre=jtnombre.getText(); 
	jlsalida.setText("bienvenid@ "+nombre);
	 
	
}

}   
