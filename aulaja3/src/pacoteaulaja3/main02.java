package pacoteaulaja3;

import java.util.Scanner;

public class main02 {

	public static void main(String[] args) {
		int anos,meses,dias;
		Scanner meuScan = new Scanner(System.in);
		System.out.println("Informe quantos anos você tem:");
		anos = meuScan.nextInt();
		System.out.println("Informe quantos meses você tem:");
		meses = meuScan.nextInt();
		System.out.println("Informe quantos dias você tem:");
		dias = meuScan.nextInt();
		System.out.print((anos*365)+(meses*30)+dias);
	}

}
