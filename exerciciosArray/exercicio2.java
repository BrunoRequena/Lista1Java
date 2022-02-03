package exerciciosArray;

import java.util.Scanner;

public class exercicio2 {
	
	public static void main(String[] args) {
		
		Integer vetor[] = new Integer[6];
		Integer soma = 0,somaI = 0,par = 0,impar = 0, x;
		Scanner ler = new Scanner(System.in);
		
		for(x=0;x<6;x++) {
		System.out.println("Digite um numero: ");
		vetor[x] = ler.nextInt();
		if(vetor[x]%2 == 0) {
			par  += vetor[x];
			soma++;
		}else if(vetor[x]%2!=0) {
			impar += vetor[x];
			somaI++;
		}
	  }
		System.out.println("\nA quantidade de números pares inseridos é: "+ soma);
		System.out.println("\nA soma dos números pares inseridos é: "+ par);
		System.out.println("\nA quantidade de números impares inseridos é: "+ somaI);
		System.out.println("\nA soma dos números impares inseridos é: "+ impar);
		
	}
}

/*2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.
*/
