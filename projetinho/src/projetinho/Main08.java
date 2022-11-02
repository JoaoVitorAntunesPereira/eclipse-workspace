package projetinho;

import java.util.Scanner;

public class Main08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int a;
		int q;
		String nome = "";
		try(Scanner meuScan = new Scanner(System.in)){
			System.out.print("Informe seu nome:");
			nome = meuScan.nextLine();
			System.out.print("Informe um número: ");
			a = meuScan.nextInt();
			q = meuScan.nextInt();
			while(i<a) {
				i++;
				System.out.println(nome);
				System.out.println(q);
			} 
		}
		
	}

}
