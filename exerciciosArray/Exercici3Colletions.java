package colletionsEexceptions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercici3Colletions {

	public static void main(String[] args) {
			
			Scanner ler = new Scanner(System.in);
			
			List <String> lista = new ArrayList<String>(); 
			
			lista.add("sapato");
			lista.add("camisa social");
			lista.add("shorts");
			lista.add("calça jeans");
			lista.add("saia");
			lista.add("vestido");
			lista.add("pijma");
			
			for(String ListaEstoque:lista) 
			{
				System.out.println(ListaEstoque);
			}
			System.out.println("\nRemovendo um elemento da lista...");
			
			System.out.println();
			
			lista.remove(2);
	
			for(String ListaEstoque:lista)
			{
				System.out.println(ListaEstoque);
			}
			
			String primeiroElemento = lista.get(0);
			System.out.println("\nO primeiro elemento é: "+primeiroElemento);
			System.out.println();
			
			for(int i=0;i<lista.size();i++)
			{
				System.out.println("\nElemento: "+lista.get(i));
			}
			Collections.sort(lista);
			
			System.out.println("\nDepois de ordenado...");
			System.out.println(lista);
		}
	}
/*Crie uma um programa para trabalhar com estoque de uma loja, 
 * o programa deverá trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, 
 * o programa deverá atender as seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.
*/