package aprender;

import java.util.Scanner;

public class positivoNegativo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		float num;
		System.out.print("\n\t Digite um n�mero: ");
		num = in.nextFloat();
		
		boolean return = isPositive(num);
		if  (return == true){
			System.out.println("\n\t O n�mero � positivo");
		} else {
			System.out.println("\n\t O n�mero � negativo");
		
	}		
	}
	
}

