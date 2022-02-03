package Bicho;
public class Preguiça extends Animal {

	public Preguiça(String nome, Integer idade, String raca) {
		super(nome, idade, raca);

	}

	@Override
	public void emitirSom() {
		System.out.println("zZzZzZzZz*RONCO*");
	}

	@Override
	public void acao() {
		System.out.println("DORMINDO");
	}

}
