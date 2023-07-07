package aprender;

import java.util.Scanner;

public class verificacaoPar {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int num, poi;
		System.out.print("\n\t Digite um número: ");
		num = in.nextInt();
		poi = (num%2);
		if  (poi==0) {
		System.out.println("\n\t O número " + num +" é par");
		}else{
		System.out.println("\n\t O número " + num +" é impar");
		
	}		
	}
	
}


