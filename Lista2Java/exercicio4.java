package Lista2Java;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		 
		Scanner leia = new Scanner(System.in);
		
		double num, par;
		
		System.out.println("Digite o valor de A:");
		num = leia.nextInt();
		
		if(num % 2 == 0) {
			
			par = Math.sqrt(num);
			System.out.printf("O valor de A é par! Sua raiz quadrada é: %2.1f ", par);
			
		}else if (num % 2 > 0) {
			System.out.println("O valor de A é impar! O valor de A² é de: "+ num*num);
		}	
	}
}
/*Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
*/