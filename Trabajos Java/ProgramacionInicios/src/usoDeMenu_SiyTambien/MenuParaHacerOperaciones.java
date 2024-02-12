package usoDeMenu_SiyTambien;

import java.util.Scanner;

public class MenuParaHacerOperaciones {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double num1,num2;
		int R=0;
		System.out.println("Digite primer numero");
		num1=entrada.nextDouble();
		System.out.println("Digite segundo numero");
		num2=entrada.nextDouble();
		byte opc;
		do {
	    System.out.println("menu 1=sumar 2=restar 3= multiplicar 4=dividir 5=modulo 6= salir");
		opc=entrada.nextByte();
		
		switch (opc) {
           case 1:System.out.println("la suma dio:"+(num1+num2));break;
           case 2:System.out.println("la resta dio:"+(num1-num2));break;
           case 3:System.out.println("la multiplicacion dio:"+(num1*num2));break;
           case 4:System.out.println("la division dio:"+(num1/num2));break;
           case 5:System.out.println("el modulo dio:"+(num1%num2));break;
           case 6:System.out.println("si desea salir pulse 3 \n si desea seguir pulse cualquier numero ");
           R=entrada.nextInt();break;
           default:System.out.println("opcion no valida");break;
           
      
		  }
	     }while(!(R>2 && R<4));
       
		System.out.println("hasta pronto");
	}

}
