package MAIN;

import java.util.Scanner;

public class Cliente {
Double valorP,valorT;
	
	Scanner leia = new Scanner(System.in);
	
	private String nomeCliente;
	private Integer codigoCliente;
	
	public Cliente (String nome, Integer codigo)
	{
		this.nomeCliente = nome;
		this.codigoCliente = codigo;
	}
	public Scanner getLeia()
	{
		return leia;
	}
	public void setLeia(Scanner leia)
	{
		this.leia = leia;
	}
	public Double getValorP()
	{
		return valorP;
	}
	public void setValorP(Double valorP)
	{
		this.valorP = valorP;
	}
	public Double getValorT()
	{
		return valorT;
	}
	public void setValorT(Double valorT)
	{
		this.valorT = valorT;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public Integer getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(Integer codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	public Double valorTotal(Double valorT)
	{
		System.out.println("\nO valor de cada produto deve ser inserido"+ "individualmente\nPara finalizar entre com 0 ou algum número negativo...");
		do
		{
			System.out.println("\nEntre com o valor:");
			valorP = leia.nextDouble();
			if(valorP>0)
			{
			valorT = valorT + valorP;
			}
			
		}
		while(valorP>0.0);
		return valorT;
	}
	
	public String getInfo()
	{
		String info = nomeCliente + "\t\t" + codigoCliente;
		return info;
	}
	
	public void comprar()
	{
		System.out.printf("\nTotal: %.2f", this.valorTotal(0.0));
	}
}



