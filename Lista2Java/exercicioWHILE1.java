package Lista2Java;

import java.util.Scanner;

public class exercicioWHILE1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int idade, cont21 =0, cont50 = 0;
		do {
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			if(idade>50) {
				cont50++;
			}else if(idade<21 && idade!=-99) {
				cont21++;
			}
		}while(idade!=-99);
		System.out.println("\nO n�mero de pessoas com menos de 21 anos s�o: "+ cont21);
		System.out.println("\nO n�mero de pessoas com mais  de 50 anos s�o: "+ cont50);
	}

}
/*Solicitar a idade de v�rias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99.*/