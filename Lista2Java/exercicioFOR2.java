package Lista2Java;

import java.util.Scanner;

public class exercicioFOR2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num, par = 0, impar = 0;
		
		for(int x=0; x<10; x++) {
			System.out.println("Digite um n�mero: ");
			num = leia.nextInt();
			
		if(num%2 == 0) {
			par++;
		}if(num%2>0) {
			impar++;
		}
	}
		System.out.println("A quantida de n�meros par � de "+par + " e de n�meros impar � de  " + impar+"." );
  }
}


//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)