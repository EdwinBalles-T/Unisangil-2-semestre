package mensajes;

import java.util.Scanner;

public class EntradaDatosNumericos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num;
		System.out.println("Digite un numero");
		num=entrada.nextInt();
		int num2;
		System.out.println("digite su numero");
		num2=entrada.nextInt();
		System.out.println("la multiplicacion dio:");
		System.out.println(num*num2);
		 System.out.println("la suma dio:");
		 System.out.println(num+num2);
          System.out.println("la resta dio:");
		  System.out.println(num-num2);
		   System.out.println("la division dio:");
		   System.out.println(num/num2);
		    System.out.println("El residuo dio:");
			System.out.println(num%num2);

		

	}

}
