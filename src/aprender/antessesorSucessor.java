package aprender;

import java.util.Scanner;

public class antessesorSucessor {

	public static void main(String[] args) {
	Scanner in = new  Scanner(System.in);
	int num1, antecessor, sucessor;
	
	System.out.print("Digite um n�mero: ");
	num1 = in.nextInt();
	
	antecessor = num1 - 1;
	sucessor = num1 + 1;
	
	System.out.println("O antecessor � " + antecessor +  " e o sucessor � "+ sucessor);
	}

}
