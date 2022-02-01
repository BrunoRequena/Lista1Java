package Familia44;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade, dias, meses, res;
		
		System.out.println("\nEscreva sua idade em anos: ");
		idade = leia.nextInt();
		System.out.println("\nEscreva quantos meses você tem: ");
		meses = leia.nextInt();
		System.out.println("\nEscreva quantos dias você tem: ");
		dias = leia.nextInt();
		
		res = (idade*365) + (meses*30) + dias;
		
		System.out.println("\nVocê tem o total de: " + res + "dias de vida");
		

	}

}
/*Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.
*/