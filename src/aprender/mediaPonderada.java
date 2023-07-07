package aprender;

import java.util.Scanner;

public class mediaPonderada {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double nota1, nota2, nota3, media;
		int peso1 = 2;
		int peso2 = 3;
		int peso3 = 5;
		
		
		System.out.print("Digite Nota 1:");
		nota1 = in.nextDouble();
		System.out.print("Digite Nota 2:");
		nota2 = in.nextDouble();
		System.out.print("Digite Nota 3:");
		nota3 = in.nextDouble();
		
		media = ((nota1*peso1)+(nota2*peso2)+(nota3*peso3))/(peso1+peso2+peso3);
		System.out.println("A media podereado do aluno é: "+media);
	}

}
