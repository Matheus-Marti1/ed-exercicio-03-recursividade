package view;

import java.util.Scanner;

import controller.FatController;

public class Principal {

	public static void main(String[] args) {
		FatController fatController = new FatController();
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira um número de 0 até 12 para calcular o seu fatorial:");
		int num = 0;
		do {
			num = entrada.nextInt();
			if (num < 0 || num > 12) {
				System.out.println("Entrada inválida, insira novamente:");
			}
		} while (num < 0 || num > 12);
		System.out.println("Fatorial de " + num + ": " + fatController.calcFatorial(num));
		entrada.close();
		System.exit(0);
	}
}
