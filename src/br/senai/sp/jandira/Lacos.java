package br.senai.sp.jandira;

import java.util.Scanner;

public class Lacos {

	public static void main(String[] args) {
		
		int valor = 0;
		int fibonacci = fibonacci *(valor -1);
		
		
		
		while(valor > 2) {
			valor --;
		 fibonacci = fibonacci *(valor -1); 
		}
		
		System.out.println(fibonacci);
		
		
		Scanner leitor = new Scanner(System.in);
		String resposta = "sim";
		
		while(resposta.equals("sim")) {
			System.out.println("Legal,mais uma volta!");
			System.out.println("Mais uma volta(s/n)?");
			resposta = leitor.next();
		}
		
		System.out.println("A brincadeira acabou!");
		
		
		

	}

}
