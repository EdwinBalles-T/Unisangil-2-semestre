package funcionesBotones;

import javax.swing.JOptionPane;

public class Joption {

	public static void main(String[] args) {
		 
        String nombre;
        nombre= JOptionPane.showInputDialog("Digite su nombre");
        JOptionPane.showMessageDialog(null,"Bienvenid@ "+nombre);//Admiraci�n
        JOptionPane.showMessageDialog(null,"Bienvenid@ "+nombre,null,0);//Error
        JOptionPane.showMessageDialog(null,"Bienvenid@ "+nombre,null,1);//Admiraci�n
        JOptionPane.showMessageDialog(null,"Bienvenid@ "+nombre,null,2);//Advertencia
        JOptionPane.showMessageDialog(null,"Bienvenid@ "+nombre,null,3);//Interrogaci�n
        JOptionPane.showMessageDialog(null,"Bienvenid@ "+nombre,null,-1);//Nada
	}

}
