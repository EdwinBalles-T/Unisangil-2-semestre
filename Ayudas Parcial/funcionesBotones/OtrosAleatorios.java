package funcionesBotones;

import java.util.concurrent.ThreadLocalRandom;

public class OtrosAleatorios {

	public static void main(String[] args) {
		int min = 1;
        int max = 10;
      
        for(int i = 1; i <=10; i++) {
        int numeros = ThreadLocalRandom.current().nextInt(min, max) + min;

        System.out.println(numeros);
        }

	}

}
