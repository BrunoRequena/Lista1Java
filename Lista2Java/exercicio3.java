package Lista2Java;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		if(idade<=14) {
			System.out.println("Voc� se encontra na categoria infantil! ");
		}else if(idade>=15 && idade<=17) {
			System.out.println("Voc� se encontra na categoria juvenil! ");
		}else if(idade<=18 && idade>25) {
			System.out.println("Voc� se encontra na categoria adulto! ");
		}
	}

}
	
/*Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto
*/
