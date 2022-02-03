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
		System.out.println("Qual a raça do doguinho? ");
		raca = ler.next();
		
		Cachorro doguinho = new Cachorro(nome,idade,raca);
		
		System.out.println("Qual o nome do cavalo? ");
		nome = ler.next();
		System.out.println("Qual idade do cavalo? ");
		idade = ler.nextInt();
		System.out.println("Qual a raça do cavalo? ");
		raca = ler.next();
		
		Cavalo horse = new Cavalo(nome,idade,raca);
		
		System.out.println("Qual o nome da preguiça? ");
		nome = ler.next();
		System.out.println("Qual idade da preguiça? ");
		idade = ler.nextInt();
		System.out.println("Qual a raca da preguiça? ");
		raca = ler.next();
		
		Preguiça preguiça = new Preguiça(nome,idade,raca);
		
		System.out.println("\nO nome do doguinho é "+doguinho.getNome()+"\nIdade do doguinho é:"+doguinho.getIdade()+"\nA raca do doguinho é:"+doguinho.getRaca());		
		System.out.println("\nO som que o doguinho faz é:");
		doguinho.emitirSom();
		System.out.println("\nA ação do doguinho no momento é:");
		doguinho.acao();
		
		System.out.println("\nO nome do horse é "+horse.getNome()+"\nIdade do horse é:"+horse.getIdade()+"\nA raca do horse é:"+horse.getRaca());		
		System.out.println("\nO som que o horse faz é:");
		horse.emitirSom();
		System.out.println("\nA ação do horse no momento é:");
		horse.acao();
		
		System.out.println("\nO nome da preguiça é "+preguiça.getNome()+"\nIdade da preguiça é:"+preguiça.getIdade()+"\nA raca da preguiça é:"+preguiça.getRaca());		
		System.out.println("\nO som que a preguiça faz é:");
		preguiça.emitirSom();
		System.out.println("\nA ação da preguiça no momento é:");
		preguiça.acao();
	}

}
