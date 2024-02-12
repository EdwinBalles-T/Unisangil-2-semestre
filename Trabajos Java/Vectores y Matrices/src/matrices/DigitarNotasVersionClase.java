package matrices;

import java.util.Scanner;

public class DigitarNotasVersionClase {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int nEst=0, nNotas=0;
		double t;

		System.out.println("Digite la cantidad de estudiantes a calificar");
		nEst=entrada.nextInt();
		System.out.println("Digite la cantidad de notas a calificar");
		nNotas=entrada.nextInt();
       System.out.println("seran: "+nEst+" estudiantes, cada uno digitara "+nNotas+" notas");
     String nombres[]=new String[nEst];
        
     double notas[][]=new double[nEst][nNotas+1];
     
      for(int i=0; i<nombres.length; i++) {
    	 t=0;
		 System.out.println("Digite su nombre: ");
		 nombres[i]=entrada.next();
		 
	for(int e=0; e<notas[0].length-1; e++) {
			do {
			    System.out.println("nota "+(e+1)+": ");
			    notas[i][e]=entrada.nextDouble();
			    }while(!(notas[i][e]>=10 && notas[i][e]<=50));
	
	            t+=notas[i][e];//manejo de acumuladores
	}
	 notas[i][nNotas]=t/nNotas;
	 
}
	    System.out.println("nombre\t| Promedio");
	    System.out.println("________________________");
	    for(int i=0; i<nombres.length; i++) {
	    	System.out.println(nombres[i]+"\t|"+notas[i][nNotas]);
	  }

	}

}
