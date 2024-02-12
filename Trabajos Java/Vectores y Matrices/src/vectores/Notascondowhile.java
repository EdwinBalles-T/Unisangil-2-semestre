package vectores;

import java.util.Scanner;

public class Notascondowhile {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);	
	    String nombres[]=new String[3];
	    double nota1[]=new double[3];
	    double nota2[]=new double[3];
	    double nota3[]=new double[3];
	    double promedio[]=new double[3];

	   for(int i=0; i<nombres.length; i++) {
		    System.out.println("Digite su nombre: ");
		    nombres[i]=entrada.next();
		   
		    do {
		    System.out.println("Digite nota 1");
		    nota1[i]=entrada.nextDouble();
		    }while(nota1[i]<10 || nota1[i]>50);
		    do {
			    System.out.println("Digite nota 2");
			    nota2[i]=entrada.nextDouble();
			    }while(nota2[i]<10 || nota2[i]>50);
		    do {
			    System.out.println("Digite nota 3");
			    nota3[i]=entrada.nextDouble();
			    }while(!(nota3[i]>=10 && nota3[i]<=50));
		    promedio[i]=(nota1[i]+nota2[i]+nota3[i])/3;
		     
	    } 
	    System.out.println("nombre\t Promedio");
	    for(int i=0; i<promedio.length; i++) {
	    System.out.println(nombres[i]+"\t"+promedio[i]);
	      
      }

	}

}
