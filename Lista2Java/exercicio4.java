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
			System.out.printf("O valor de A � par! Sua raiz quadrada �: %2.1f ", par);
			
		}else if (num % 2 > 0) {
			System.out.println("O valor de A � impar! O valor de A� � de: "+ num*num);
		}	
	}
}
/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
*/