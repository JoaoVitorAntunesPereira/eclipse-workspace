package Joguinho;

import java.util.Scanner;

public class Escoito {

	public static void Escolhaoito() {
		Scanner meuScan = new Scanner (System.in);
		int n1;
		int n2;
		System.out.println("Ao entrar no apartamento, você percebe que a TV está ligada, passando um noticiário sobre o apocalípse.");
		System.out.println("'Soldados estão a procura de sobreviventes, vá a os terraços dos predios e faça um sinal, como por exemplo, escrever algo, como SOS'");
		System.out.println("'Os zumbis estão se mutando muito rápido, precisamos de alguém capaz para conseguir fazer a cura'");
		System.out.println("'Se os zumbis continuarem se mutando dessa forma... O fim de todos estará próximo, nem mesmo pessoas muito fortes conseguirão sobreviver a isso'");
		System.out.println("1: Fazer um sinal no terraço");
		System.out.println("2: Não fazer um sinal o terraço");
		n1 = meuScan.nextInt();
		if(n1==1) {
			System.out.println("Enquantos você esta fazendo o sinal, você percebe zumbis chegando ao seu redor, você é forçado a lutar com eles");
			if(Main.Força<=9) {
				System.out.println("Você morreu.");
				 System.exit(1);
			}
			if(Main.Força>=10) {
				System.out.println("Você derrotou os zumbis.");
		}
		
		
		}
		if(n1==2) {
			System.out.println("Você morreu, após um tempo os zumbis se mutaram tanto, que a sua força não foi capaz de segura-los");
			System.exit(1);
		}
	}
}