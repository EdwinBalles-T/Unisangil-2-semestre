package matrices;

import java.util.Scanner;

public class TareaDigitarCantidadNotas {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int nEst=0, nNotas=0,suma;
		double t;
		double h,p;
		System.out.println("Digite la cantidad de estudiantes a calificar");
		nEst=entrada.nextInt();
		System.out.println("Digite la cantidad de notas a calificar");
		nNotas=entrada.nextInt();
       System.out.println("seran: "+nEst+" estudiantes, cada uno digitara "+nNotas+" notas");
     String nombres[]=new String[nEst];
      suma=nNotas+1;
     double notas[][]=new double[suma][nEst];
      
      for(int i=0; i<nEst; i++) {
    	  t=0;
    	  h=0;
		 System.out.println("Digite su nombre: ");
		 nombres[i]=entrada.next();
	 
	for(int e=0; e<nNotas; e++) {
		
			do {
			    System.out.println("nota "+(e+1)+": ");
			    notas[e][i]=entrada.nextDouble();
			    }while(!(notas[e][i]>=10 && notas[e][i]<=50));
			
			t=notas[e][i]+h;
			h=t;
   
	}	p=h/nNotas;
	notas[nNotas][i]=p;
	
}
	    System.out.println("nombre\t Promedio");
	    for(int i=0; i<nombres.length; i++) {
	    	System.out.println(nombres[i]+"\t"+notas[nNotas][i]);
	  }

	}

}
