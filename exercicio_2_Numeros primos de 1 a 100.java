package lacos_3;

import java.util.Scanner;

public class exercicio_2 {

	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	
    for (int i = 2; i < 100; i++) {
        boolean nPrimo = true;
        for (int j = 2; j <= i; j++) {
            if (((i % j) == 0) && (j != i)) {
                nPrimo = false;
                break;
            }
        }

        if (nPrimo) {
            System.out.println(i + " é um número Primo!");
        } 
    }
	
	ler.close();

	}

}
