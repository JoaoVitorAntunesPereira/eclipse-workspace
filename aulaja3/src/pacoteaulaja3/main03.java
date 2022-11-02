package pacoteaulaja3;

import java.util.Scanner;

public class main03 {

	public static void main(String[] args) {
		float slaus;
		Scanner meuScan = new Scanner(System.in);
		System.out.println("Informe seu salário: ");
		slaus = meuScan.nextInt();
		System.out.println("Seu salário é: " + slaus);
		System.out.println("O salário mínimo é: 1200");
		float sla2 = slaus/1200;
		System.out.println("Você ganha: " +(sla2) + " salários mínimos");
	}


}
