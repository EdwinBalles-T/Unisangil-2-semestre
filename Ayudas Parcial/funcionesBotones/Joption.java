package funcionesBotones;

import javax.swing.JOptionPane;

public class Joption {

	public static void main(String[] args) {
		 
        String nombre;
        nombre= JOptionPane.showInputDialog("Digite su nombre");
        JOptionPane.showMessageDialog(null,"Bienvenid@ "+nombre);
	}

}
