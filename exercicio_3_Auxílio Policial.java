package lacos_3;

import java.util.Scanner;

public class exercicio_3 {

	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	
	 int resultado=0;
	 String R1,R2,R3,R4,R5;
	 
	 System.out.println("Responda somente com S ou N");
	 for(int R=1;R<6;R++) {
		 if(R==1) {
			 System.out.println("Você tem o telefone da vitíma?");
			 R1 = ler.next();
			 if(R1.contentEquals("s")) {
				 resultado++;
			 }
		 }
		 if(R==2) {
			 System.out.println("Esteve no local do crime?");
			 R2= ler.next();
			 if(R2.contentEquals("s")){
			 resultado++;
			 }
		 }
		 if(R==3) {
			 System.out.println("Mora perto da vitíma?");
			 R3= ler.next();
			 if(R3.contentEquals("s")) {
				 resultado++;
			 }
		 }
		 if(R==4) {
			 System.out.println("Devia dinheiro para a vitíma?");
			 R4= ler.next();
			 if(R4.contentEquals("s")) {
				 resultado++;
			 }
		 }
		 if(R==5) {
			 System.out.println("Já trabalhou com a vitíma?");
			 R5= ler.next();
			 if(R5.contentEquals("s")) {
				 resultado++;
			 }
		 }
	 }
	 if(resultado==2) {
		 System.out.println("Suspeito");
	 }else if(resultado==3) {
		 System.out.println("Cumplice");
	 }else if(resultado==4) {
		 System.out.println("Cumplice");
	 }else if(resultado==5) {
		 System.out.println("Culpado(assasino)");
	 } else {
		 System.out.println("Inocente");
	 }
		
	
	
	ler.close();

	}

}
