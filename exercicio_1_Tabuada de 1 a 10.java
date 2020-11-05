package lacos_3;

import java.util.Scanner;

public class exercicio_1 {

	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	
	int x,i=0;
	
	for(x=0; x<=10; x++) {
		for(i=0;i<=10; i++) {
		System.out.print(x+"*" +i+ "=");
		System.out.println(x * i);
		}
	}
	
	ler.close();

	}

}
