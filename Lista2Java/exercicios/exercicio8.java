package exercicios;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float fab, custoI,custoD,custoF;
		
		System.out.println("Digite o custo de f�brica do carro");
		fab = leia.nextFloat();
		
		custoF = ((fab/100)*45)((fab/100)*28);
		custoD = ((fab/100)*28);
		custoF = custoI + fab + custoD;
		
		System.out.println("O custo final ao consumidor � de: "+custoF);
		
	}

}
/*O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
consumidor.*/