package Lista2Java;

import java.util.Scanner;

public class exercicioFOR2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num, par = 0, impar = 0;
		
		for(int x=0; x<10; x++) {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			
		if(num%2 == 0) {
			par++;
		}if(num%2>0) {
			impar++;
		}
	}
		System.out.println("A quantida de números par é de "+par + " e de números impar é de  " + impar+"." );
  }
}


//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)