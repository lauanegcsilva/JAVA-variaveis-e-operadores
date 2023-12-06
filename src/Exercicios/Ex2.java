package Exercicios;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
float nota1, nota2, nota3, nota4, mediaFinal;

System.out.println("\n Digite a nota 1: ");
nota1 = leia.nextFloat();
System.out.println("\nDigite a nota 2: ");
nota2 = leia.nextFloat();
System.out.println("\nDigite a nota 3: ");
nota3 = leia.nextFloat();
System.out.println("\nDigite a nota 4: ");
nota4 = leia.nextFloat();

mediaFinal = (nota1 + nota2 + nota3 + nota4)/4;

System.out.println("Média Final: " +  String.format("%.1f", mediaFinal));

leia.close();
	}

}
