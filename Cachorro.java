package Bicho;

public class Cachorro extends Animal{//extends = Filho da classe Animal;

	public Cachorro(String nome, Integer idade, String raca) {   //atributos da classe animal
		super(nome, idade, raca);                                //executa o construtor da classe PAI = ANIMAL;
	}

	@Override //tr�s o metodo abstrato da classe pai;
	public void emitirSom() {
		System.out.println("AU AU AU");	//a��o especifica desse animal.	
	}

	@Override
	public void acao() {
		System.out.println("*CAMINHANDO*");
	}
	
	
	
	
}
