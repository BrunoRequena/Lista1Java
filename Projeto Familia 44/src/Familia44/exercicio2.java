package Familia44;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia =  new Scanner(System.in);
		
		int idadeDias;
		
		System.out.println("\nEscreva quantos dias de vida você tem: ");
		idadeDias = leia.nextInt();
		
		System.out.println("\nVocê tem " + idadeDias/365 + " anos " + (idadeDias%365)/30 + " meses " + (idadeDias%365)%30 + " e dias");

	}

}
/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/
