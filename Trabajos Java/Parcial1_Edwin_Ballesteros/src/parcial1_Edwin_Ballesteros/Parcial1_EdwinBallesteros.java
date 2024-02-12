//Edwin Santiago Ballesteros Cristancho   Grupo A


package parcial1_Edwin_Ballesteros;

import java.util.Scanner;

public class Parcial1_EdwinBallesteros {
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int Salir=0;
		byte opc;
		int num[]=new int[10];
	    int vec[]=new int[10];
		do{ 
		int numM=0;
		int pos=0;
		System.out.println("Menu\n1=Ejercicio 1\n2=Ejercicio 2\n3=Salir");
		opc=entrada.nextByte();
		switch(opc) {
		case 1:
			num [0]= 15;
			  num [1]= 22;
					  num [2]= 18;
							  num[3]= 34;
							      num[4]= 26;
									    num [5]= 13;
									       num [6]= 29;
											     num [7]= 17;
													    num[8]= 33;
															 num[9]= 14;
			
	 
		
		System.out.println("Su numero mayor es: "+num[3]+" en la posicion: 4");break;
		
		case 2:
		int elemA[]=new int[10];
		int elemB[]=new int[10];
		for(int j=0; j<10; j++) {
		do {
		System.out.println("Digite su numero "+(j+1)+" del conjunto A");
		elemA[j]=entrada.nextInt();
		}while(!(elemA[j]>-10 && elemA[j]<10));
		}
	    
		for(int h=0; h<10; h++) {
		do {
	    System.out.println("Digite su numero "+(h+1)+" del conjunto B");
		
		elemB[h]=entrada.nextInt();
		}while(!(elemB[h]>-10 && elemB[h]<10));
		}
	    
		for(int s=0; s<10; s++) {
		vec[s]=(elemA[s]*elemB[9-s]);
		}
	 
	for(int i=0; i<10; i++) {
	
     System.out.println(elemA[i]+" x "+elemB[9-i]+" = "+vec[i]);
	
		}break;
	
	
		case 3:
			System.out.println("Si desea salir = pulse 3\nSi desea continuar = pulse cualquier numero");
	Salir=entrada.nextInt();break;
		default: 
			System.out.println("su numero no es valido");
		
		
		}
		 
		}while(!(Salir>2 && Salir<4));
System.out.println("Hasta pronto");
  }
	
}
