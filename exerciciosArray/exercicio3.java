package exerciciosArray;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		float[][] m1 = new float[3][3];
		int l,c,maior=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(l=0;l<3;l++)
		{
			for(c=0;c<3;c++)
			{
				System.out.println("\nEntre com M1: ");
				m1[l][c] = leia.nextFloat(); 
			}
		}for(int x = 0; x<3; x++) {
			for(int y = 0; y<3; y++) {
				if(m1[x][y]>10) {
					maior++;	
				}
			}
		}

		System.out.println("A quantidade de valores acima de 10 são: "+maior);
	}

}
//3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.

