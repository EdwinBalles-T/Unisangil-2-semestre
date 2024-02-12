package usoDeMenu_SiyTambien;

import java.util.Scanner;

public class IfparaSaludarPersonas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nombre;
		int G;
		byte E;
		System.out.println("digite su nombre porfavor");
		nombre=entrada.nextLine();    
		System.out.println("digite su genero, si es:\n hombre=1\n mujer=2\nGracias");
		G=entrada.nextInt();
		System.out.println("Digite su edad");
		E=entrada.nextByte();
		if (G==1){
		
		if (E>=18){
		 if (E>=27){
		  if (E>=48){ 
		    	 System.out.println("Bienvenido Don "+(nombre));
		 }else
			 System.out.println("Bienvenido Mr. "+(nombre));
		   
		     }else
			 System.out.println("Bienvenido Muchacho "+(nombre));
		 
		 }else 
			 System.out.println("Bienvenido Niño "+(nombre));
		 
		   
		 
		 }else if(G==2) {
			 
		 if (E>=18){
		  if (E>=27){
		   if (E>=50){
                         System.out.println("Bienvenida Doña "+(nombre));
		 }else
			 System.out.println("Bienvenida Ms. "+(nombre));
		   
		    }else
				 System.out.println("Bienvenida Muchacha "+(nombre));
			 
	           }else 
	  			 System.out.println("Bienvenida Niña "+(nombre));
		  
		 }

	}

}
