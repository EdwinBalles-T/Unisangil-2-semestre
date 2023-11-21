package funcionesBotones;

import java.util.Random;

public class CaraDeMoneda {

	public static void main(String[] args) {
	   
		Random numAleatorio = new Random();

		// Genera un boolean de forma aleatoria
		boolean moneda = numAleatorio.nextBoolean();

		// Si es verdadero cara y sino cruz
		if (moneda) {
		System.out.println("Cara");
	} else {
	    System.out.println("Cruz");
	}

	}

}
