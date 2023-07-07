package aprender;

import java.util.Scanner;

public class mediaAritmedica {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double num1, num2, num3, media;
		
		System.out.print("\t Digite primeiro numero: ");
		num1 = in.nextDouble();
		System.out.print("\t Digite segundo numero: ");
		num2 = in.nextDouble();
		System.out.print("\t Digite terceiro numero: ");
		num3 = in.nextDouble();
	
		media = (num1 + num2 + num3)/3;
		
		System.out.print("\n A media aritmedica é: " + media + ".");
	}

}
