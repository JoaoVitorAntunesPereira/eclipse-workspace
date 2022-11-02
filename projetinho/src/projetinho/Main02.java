package projetinho;

import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
		String nome;
		try (Scanner meuScan = new Scanner(System.in)) {
			nome = meuScan.nextLine();
		}
		System.out.print(nome);

	}

}
