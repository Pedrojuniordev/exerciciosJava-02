package aprender;

import java.util.Scanner;

public class multiplicacao {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num1, num2, multi;
		
		System.out.print("Digite primeiro número: ");
		num1 = in.nextInt();
		System.out.print("Digite segundo número: ");
		num2 = in.nextInt();
		
		multi = num1 * num2; 
		System.out.println("O resultado da multiplicação é: " + multi);
	
	}

}
