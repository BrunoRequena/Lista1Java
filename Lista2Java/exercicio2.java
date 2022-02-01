package Lista2Java;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int A,B,C;
		
		System.out.println("Digite o valor de A: ");
		A = leia.nextInt();
		System.out.println("Digite o valor de B: ");
		B = leia.nextInt();
		System.out.println("Digite o valor de C: ");
		C = leia.nextInt();
		
		if(A<B && A<C && B<C){
			System.out.println("A ordem crescente dos números inseridos é: "+A+" - "+B+" - "+C);
		}else if(B<A && B<C && C<A){
			System.out.println("A ordem crescente dos números inseridos é: "+B+" - "+C+" - "+A);	
		}else if(C<A && C<B && A<B){
			System.out.println("A ordem crescente dos números inseridos é: "+C+" - "+A+" - "+B);
		}else if(B<A && A<C){
			System.out.println("A ordem crescente dos números inseridos é: "+B+" - "+A+" - "+C);
		}else if(A<B && C<B) {
			System.out.println("A ordem crescente dos números inseridos é: "+A+" - "+C+" - "+B);
		}else{
			System.out.println("A ordem crescente dos números inseridos é: "+C+" - "+B+" - "+A);
		}
	}
}
//Faça um programa que entre com três números e coloque em ordem crescente.
