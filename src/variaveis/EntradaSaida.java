package variaveis;

import java.util.Scanner;

public class EntradaSaida {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade;
		String nome;
		
		System.out.println("Entre com a sua idade: "); //sysout
		idade = ler.nextInt();
		
		System.out.println("Entre com o seu nome: ");
		ler.skip("\\R?");
		nome = ler.nextLine();
		
		System.out.println("Sua idade é: "+ idade + " \nSeu nome é: "+nome.toUpperCase());
		
		ler.close();
	}
}
