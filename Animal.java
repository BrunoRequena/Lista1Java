package Bicho;

public abstract class Animal {
	
	private String nome;
	private Integer idade;//atributos
	private String raca;
	public Animal(String nome, Integer idade, String raca) {
		this.raca = raca;											//this = variavel é igual a variavel que eu passar
		this.nome = nome;											//construtor(cria meu objeto)
		this.idade = idade;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public abstract void emitirSom();
	public abstract void acao();
}
