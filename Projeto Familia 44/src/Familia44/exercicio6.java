package Familia44;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int x1,x2,y1,y2;
		double D,P1,P2;
		
		System.out.println("Digite o valor de x1: ");
		x1 = leia.nextInt();
		System.out.println("Digite o valor de x2: ");
		x2 = leia.nextInt();
		System.out.println("Digite o valor de y1: ");
		y1 = leia.nextInt();
		System.out.println("Digite o valor de y2: ");
		y2 = leia.nextInt();
		
		P1 = Math.pow((x2 - x1), 2);
		P2 = Math.pow((y2 - y1), 2);
		D = Math.sqrt(P1 + P2);
		
		System.out.println("\nA distância entres os pontos é de: " + D);
		
	}

}
/*Construa um programa em c que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula

que efetua tal cálculo é:*/
