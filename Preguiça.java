package Bicho;
public class Pregui�a extends Animal {

	public Pregui�a(String nome, Integer idade, String raca) {
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
