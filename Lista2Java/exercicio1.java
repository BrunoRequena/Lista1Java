package Lista2Java;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int A,B,C,maior = 0;
		
		System.out.println("Digite o valor de A: ");
		A = leia.nextInt();
		System.out.println("Digite o valor de B: ");
		B = leia.nextInt();
		System.out.println("Digite o valor de C: ");
		C = leia.nextInt();
		
		if(A>B && A>C) {
			System.out.println("O maior valor digitado foi: "+ A);
		}else if(B>A && B>C) {
			System.out.println("O maior valor digitado foi: "+ B);
		}else {
			System.out.println("O maior valor digitado foi: "+ C);
		}
	}
}
/*Faça um programa que receba três inteiros e diga qual deles é o maior.
*/