package clases;

import java.util.Scanner;

public class MundoPersonas {

	public static void main(String[] args) {
		   
		
		Persona per1= new Persona();
		 Scanner sc = new Scanner(System.in);
		 char gn;
		 
		 Vigilante vg = new Vigilante();
		 Gerente gr = new Gerente();
		 
		  
		 System.out.println("Digite su identificacion: ");
		 per1.setId(sc.nextInt());
		 //.id = sc.nextInt();
		 System.out.println("Digite su nombre: ");
		 per1.setnombre(sc.next());
		 System.out.println("Digite su apellido: ");
		 per1.setapellido(sc.next());
		 System.out.println("Digite su estatura en metros: ");
		 per1.setestatura(sc.nextDouble());
		 System.out.println("Digite su peso en kilos: ");
		 per1.setpeso (sc.nextDouble());
		 System.out.println("Digite su genero \n\t(M) si es hombre o \n\t(F) si es mujer: ");
		 per1.setgenero(sc.next().charAt(0));
		 System.out.println("Digite su edad: ");
		 per1.setedad(sc.nextInt());
		 
		 if(per1.getgenero()=='M') {
		 System.out.print("El Sr. ");
		 gn = 'o';
		 
		 }else {
			 
			 System.out.print("La Sra. ");
		 gn='a';
		 }
		 System.out.println(per1.getnombre()+" "+per1.getapellido());
		 System.out.println("identificad"+gn+" con cedula de ciudadania No. "+per1.getId());
		 System.out.println("Con altura de "+per1.getestatura()+" m. y de peso "+per1.getpeso()+" Kl");

	}

}
