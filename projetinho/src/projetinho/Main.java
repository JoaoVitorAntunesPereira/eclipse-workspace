package projetinho;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  num;
		try (Scanner meuScan = new Scanner(System.in)) {
			num = meuScan.nextInt();
		}
		System.out.println("O succesor de " + Integer.toString(num + 1) );
		System.out.println("O antecessor de " + Integer.toString(num - 1) );
	}

}
