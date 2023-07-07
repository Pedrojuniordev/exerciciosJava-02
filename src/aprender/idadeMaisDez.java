package aprender;

import java.util.Scanner;

public class idadeMaisDez {

	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
	
	String nome;
	int idade, futuro;
	
	System.out.print("Digite Seu nome: ");
	nome = in.next();
	System.out.print("Digite sua idade: ");
	idade = in.nextInt();
	
	futuro = idade + 10;
	System.out.print(nome + ",daqui dez anos terá: " + futuro + " anos.");
	}

}
