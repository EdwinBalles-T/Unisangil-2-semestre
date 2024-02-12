package vectores;

import java.util.Scanner;

public class NotasUsodeFor {

	public static void main(String[] args) {
		int edades[]=new int[5];
		Scanner entrada = new Scanner (System.in);
		for(int i=0; i<edades.length; i++) {
			System.out.println("digite su edad");
			edades[i]=entrada.nextInt();
		}
		for(int i=0; i<edades.length; i++) {
			System.out.println(edades[i]);
		}
	   
	}

}
