package Familia44;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float nota1, nota2, nota3, media;
		
		System.out.println("\nPor favor, digite nota1:");
		nota1 = leia.nextFloat();
		System.out.println("\nPor favor, digite nota2:");
		nota2 = leia.nextFloat();
		System.out.println("\nPor favor, digite nota3:");
		nota3 = leia.nextFloat();
		
		media = ((nota1*2) + (nota3*3) + (nota3*5)) / (2+3+5);
		
		System.out.println("Sua m�dia �:"+media);
		
		
	}

}
/*Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
respectivamente.*/
