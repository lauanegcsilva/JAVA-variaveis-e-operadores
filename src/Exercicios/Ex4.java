package Exercicios;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float numero1, numero2, numero3, numero4, diferenca;
		
		System.out.println("\n Digite o numero 1: ");
		numero1 = leia.nextFloat();
		System.out.println("\nDigite o numero 2: ");
		numero2 = leia.nextFloat();
		System.out.println("\nDigite o numero 3: ");
		numero3 = leia.nextFloat();
		System.out.println("\nDigite o numero 4: ");
		numero4 = leia.nextFloat();
		
		diferenca = (numero1*numero2)-(numero3*numero4);
		
		System.out.println("\nA diferença dos produtos é de " + diferenca);
		
		leia.close();

	}

}
