package MAIN;

public class Aviao {

	private String nomeFab;
	private String numModelo;
	private Integer numAssentos;

	
	public Aviao(String nomeFab, String numModelo, Integer numAssentos) {
		this.nomeFab = nomeFab;
		this.numModelo = numModelo;
		this.numAssentos = numAssentos;
	}
	public String getNomeFab() {
		return nomeFab;
	}
	public void setNomeFab(String nomeFab) {
		this.nomeFab = nomeFab;
	}
	public String getNumModelo() {
		return numModelo;
	}
	public void setNumModelo(String numModelo) {
		this.numModelo = numModelo;
	}
	public Integer getNumAssentos() {
		return numAssentos;
	}
	public void setNumAssentos(Integer numAssentos) {
		this.numAssentos = numAssentos;
	}
	
	
}
/*Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/