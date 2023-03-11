package Joguinho;

import java.util.Scanner;

public class Escdois {
	public static void Escolhadois() {
	int n1;
	Scanner meuScan = new Scanner (System.in);
	System.out.println("Após 2 dias de sobrevivencia, logo você percebe que esta sem comida");
	System.out.println("1:Sair para coletar recursos");
	System.out.println("2:Não sair");
	n1 = meuScan.nextInt();

	if(n1==1) {
		 System.out.println("Quando sai de casa, você se depara com um zumbi:");
	}
	if(n1==2) {
		System.out.println("Você morreu de fome.");
		System.exit(1);
	}

	}
}
