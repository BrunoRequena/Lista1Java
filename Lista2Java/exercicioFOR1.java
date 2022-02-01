package Lista2Java;

public class exercicioFOR1 {

	public static void main(String[] args) {
		
		for(int x=1000; x<2000;x++) {
			if(x%11==5){
				System.out.println("Todos os com resto = 5 são: "+x);
			}
		}
		
	}

}
/*Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)*/