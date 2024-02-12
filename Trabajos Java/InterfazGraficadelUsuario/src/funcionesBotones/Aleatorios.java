package funcionesBotones;

import java.util.Random;

public class Aleatorios {

	public static void main(String[] args) {
	 
				int min = 1;
				int max = 10;

				Random random = new Random();

				int Num = random.nextInt(max + min) + min;
				System.out.println(Num);
		    }

	}


