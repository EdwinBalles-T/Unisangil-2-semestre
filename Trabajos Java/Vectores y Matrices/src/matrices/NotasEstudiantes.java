package matrices;

import java.util.Scanner;

public class NotasEstudiantes {

	public static void main(String[] args) {
		 
			Scanner entrada=new Scanner(System.in);	
			    String nombres[]=new String[3];
			    double notas[][]=new double[3][4];
			    for(int i=0; i<nombres.length; i++) {
				 System.out.println("Digite su nombre: ");
				 nombres[i]=entrada.next();
				for(int j=0; j<notas.length; j++) {
					do {
					    System.out.println("nota "+(j+1)+": ");
					    notas[i][j]=entrada.nextDouble();
					    }while(!(notas[i][j]>=10 && notas[i][j]<=50));
		              }
				notas[i][3]=(notas[i][0]+notas[i][1]+notas[i][2])/3;
				}
			    System.out.println("nombre\t Promedio");
			    for(int i=0; i<notas.length; i++) {
			    	System.out.println(nombres[i]+"\t"+notas[i][3]);
			  }
		   }
				
		}





		
	
