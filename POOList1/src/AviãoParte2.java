import java.util.Scanner;

import MAIN.Aviao;

public class AviãoParte2 {

	public static void main(String[] args) {
		
		Aviao aviao = new Aviao("NASA", "12345", 45);
		
		System.out.println("O nome é: "+aviao.getNomeFab()+" O número de modelo é: "+aviao.getNumModelo()+" A quantidade de assentos dele é: "+aviao.getNumAssentos());
		
		
	}

}
