package Exercicios;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
	
		float salario, abono, novoSalario;
		
		System.out.println("\n\tDigite o salário: ");
		salario = leia.nextFloat();
		System.out.println("\n\t\\n\\tDigite o abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println("\n\tNovo salário: "+ novoSalario);
		
		leia.close();

	}

}
