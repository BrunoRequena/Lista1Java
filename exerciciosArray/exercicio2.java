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
		System.out.println("\nA quantidade de n�meros pares inseridos �: "+ soma);
		System.out.println("\nA soma dos n�meros pares inseridos �: "+ par);
		System.out.println("\nA quantidade de n�meros impares inseridos �: "+ somaI);
		System.out.println("\nA soma dos n�meros impares inseridos �: "+ impar);
		
	}
}

/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.
*/
