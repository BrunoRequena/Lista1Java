package Bicho;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String nome, raca;
		Integer idade;
		
		System.out.println("Qual o nome do doguinho? ");
		nome = ler.next();
		System.out.println("Qual idade do doguinho? ");
		idade = ler.nextInt();
		System.out.println("Qual a ra�a do doguinho? ");
		raca = ler.next();
		
		Cachorro doguinho = new Cachorro(nome,idade,raca);
		
		System.out.println("Qual o nome do cavalo? ");
		nome = ler.next();
		System.out.println("Qual idade do cavalo? ");
		idade = ler.nextInt();
		System.out.println("Qual a ra�a do cavalo? ");
		raca = ler.next();
		
		Cavalo horse = new Cavalo(nome,idade,raca);
		
		System.out.println("Qual o nome da pregui�a? ");
		nome = ler.next();
		System.out.println("Qual idade da pregui�a? ");
		idade = ler.nextInt();
		System.out.println("Qual a raca da pregui�a? ");
		raca = ler.next();
		
		Pregui�a pregui�a = new Pregui�a(nome,idade,raca);
		
		System.out.println("\nO nome do doguinho � "+doguinho.getNome()+"\nIdade do doguinho �:"+doguinho.getIdade()+"\nA raca do doguinho �:"+doguinho.getRaca());		
		System.out.println("\nO som que o doguinho faz �:");
		doguinho.emitirSom();
		System.out.println("\nA a��o do doguinho no momento �:");
		doguinho.acao();
		
		System.out.println("\nO nome do horse � "+horse.getNome()+"\nIdade do horse �:"+horse.getIdade()+"\nA raca do horse �:"+horse.getRaca());		
		System.out.println("\nO som que o horse faz �:");
		horse.emitirSom();
		System.out.println("\nA a��o do horse no momento �:");
		horse.acao();
		
		System.out.println("\nO nome da pregui�a � "+pregui�a.getNome()+"\nIdade da pregui�a �:"+pregui�a.getIdade()+"\nA raca da pregui�a �:"+pregui�a.getRaca());		
		System.out.println("\nO som que a pregui�a faz �:");
		pregui�a.emitirSom();
		System.out.println("\nA a��o da pregui�a no momento �:");
		pregui�a.acao();
	}

}
