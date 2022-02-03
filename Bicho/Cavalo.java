package Bicho;

public class Cavalo extends Animal {

	public Cavalo(String nome, Integer idade, String raca) {
		super(nome, idade, raca);
	}

	@Override
	public void emitirSom() {
		System.out.println("HIHIHIHIHIHI");
	}

	@Override
	public void acao() {
		System.out.println("*GALOPANDO*");
	}
	
	

}
