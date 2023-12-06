package Exercicios;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.println("\nDigite o seu salário bruto: ");
		salarioBruto = leia.nextFloat();
		System.out.println("\nDigite o seu adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		System.out.println("\nDigite as suas horas extras: ");
		horasExtras = leia.nextFloat();
		System.out.println("\nDigite os ses decontos: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.println("\nO seu salário líquido é de: R$" + salarioLiquido);
		
		leia.close();
	}

}
