package projetinho;

import java.util.Scanner;

public class Main09 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int soma = 0;
		try(Scanner meuScan = new Scanner(System.in)){
		for(int i = 1;i<=10; i++) {
			System.out.print("Informe a "+Integer.toString(i)+ "° idade");
				a = meuScan.nextInt();
				soma+=a;
			}
		System.out.println(soma);
		}
	}

}
