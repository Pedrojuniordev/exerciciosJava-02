package aprender;

import java.util.Scanner;

public class areaCirculo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double raio, area;
		double pi =3.14159;	
		
		System.out.print("Digite o valor do Raio: ");
		raio = in.nextDouble();
		
		
		area = pi*(raio*raio);
		
		System.out.println("A area do circulo é: " + area);
	}

}
