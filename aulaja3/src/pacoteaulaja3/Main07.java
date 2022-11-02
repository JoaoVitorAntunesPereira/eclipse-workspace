package pacoteaulaja3;

import java.util.Scanner;

public class Main07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int a;
		String nome = "";
		System.out.print("Informe seu nome:");
		Scanner meuScan = new Scanner(System.in);
			nome = meuScan.nextLine();
			System.out.print("Informe um número: ");
			a = meuScan.nextInt();
			while(i<a) {
				i++;
				System.out.println(nome);
			}
	}
}
