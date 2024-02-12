package funcionesBotones;

import javax.swing.JOptionPane;

public class Joption {

	public static void main(String[] args) {
		 
        String nombre;
        nombre= JOptionPane.showInputDialog("Digite su nombre");
        JOptionPane.showMessageDialog(null,"Bienvenid@ "+nombre);//Admiración
        JOptionPane.showMessageDialog(null,"Bienvenid@ "+nombre,null,0);//Error
        JOptionPane.showMessageDialog(null,"Bienvenid@ "+nombre,null,1);//Admiración
        JOptionPane.showMessageDialog(null,"Bienvenid@ "+nombre,null,2);//Advertencia
        JOptionPane.showMessageDialog(null,"Bienvenid@ "+nombre,null,3);//Interrogación
        JOptionPane.showMessageDialog(null,"Bienvenid@ "+nombre,null,-1);//Nada
	}

}
