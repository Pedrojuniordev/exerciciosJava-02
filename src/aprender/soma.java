package aprender;

import java.util.Scanner;

public class soma {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int num1, num2, soma;
		
		System.out.print("\n\t Digite o primeiro número: ");
		num1 = in.nextInt();
		System.out.print("\n\t Dgite o segundo número: ");
		num2 = in.nextInt();
		
		soma = num1 + num2;
		
		System.out.print("\n\t O resusltado da soma é: " + soma + ".");
	}
	

}
