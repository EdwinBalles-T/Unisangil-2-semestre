package mensajes;

import java.util.Scanner;

public class ImprimirDatosPersonas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int edad;
		System.out.println("Digite su edad");
		edad=entrada.nextInt();
		System.out.println("su edad es:");
		System.out.println(edad);
		String nombre;
		System.out.println("Digite su nombre");
		nombre=entrada.nextLine();
		System.out.println("Su nombre es:");
		System.out.print(nombre);



	}

}
