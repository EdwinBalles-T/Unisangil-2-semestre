package vectores;

import java.util.Scanner;

public class AlternativaNotas {
	
	static Scanner entrada = new Scanner (System.in);

	public static void main(String[] args) {
		String nombres[]= new String[5];
		double notas[]= new double[4];
		double P;
		for(int i=0; i<nombres.length; i++) {
	    double H=0,N=0;
		System.out.println("Digite su nombre");
		nombres[i]=entrada.next();
		 
		for(int j=1; j<notas.length; j++) {
		System.out.println("Digite su nota N# "+j);
		notas[j]=entrada.nextDouble();
			H=N+notas[j];
			N=H;
    	}P=H/3;
    	
    	System.out.println(nombres[i]);
        System.out.println("su nota es="+"\n"+P);
		
		}   //Hace falta un moderador do while 
		 

	}

}
