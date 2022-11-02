package pacoteaulaja3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int num;
		Scanner meuScan = new Scanner(System.in);
		num = meuScan.nextInt();
		System.out.println("O succesor de " + Integer.toString(num + 1) );
		System.out.println("O antecessor de " + Integer.toString(num - 1) );
		System.out.println(num + 1);
	}

}
