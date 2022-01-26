package Familia44;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int segundos;
		
		System.out.println("\nEscreva o tempo de duração do evento em segundos: ");
		segundos = leia.nextInt();
		
		System.out.println("A duração do evento em horas,minutos e segundos é: " + segundos/3600 + "hr " + (segundos % 3600)/60 + " minutos " + (segundos%3600)%60 + " e segundos ");
	}

}
/*Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/
