package numerosEjercicios;

import java.util.Scanner;

public class SerieFibonachi {
  
		 
		static Scanner entrada = new Scanner (System.in);
		

		public static void main(String[] args) {
			  
	         int R=0;
	        
	         do {
	         long val,pre=0,pos=1;		 
	        System.out.println("MENU:\n1= Ver los primeros 20 numeros de la serie fibonacci\n2= Ver mas de 200 numeros de la serie fibonacci\n3= Salir");
	         byte M=entrada.nextByte();
	         switch (M) {
	         case 1: System.out.println(pre+"\t"+pos);
	         for(int x=0; x<=18; x++){
	        	 
	        	 val=pre+pos;
	        	 pre=pos;
	        	 pos=val; 
	        	 System.out.println("\t"+val);}break;
	        	 
	         case 2: System.out.println("Ingrese la cantidad de operaciones mayor que 200 y menor que 1000");
	            int n=entrada.nextInt();
	            if (n>200 && n<1000) {
	            System.out.println(pre+"\t"+pos);
	        	 for(int x=3; x<=n; x++){
	        		 val=pre+pos;
	            	 pre=pos;
	            	 pos=val;
	            	 System.out.println("\t"+val);}}
	            else { System.out.println("su numero es superior o inferior al limite");}break;
	         case 3: 
	           System.out.println("si desea salir pulse el numero 3\nsi desea seguir pulse cualquier numero");
	            R=entrada.nextInt();break;
	           default: System.out.println("El numero que digito no esta registrado lea atentamente las instrucciones");break;
	       
	         }
	  
	        }while(!(R>2 && R<4));
	    System.out.println("Hasta pronto");
		
		}
	  
           

	}


