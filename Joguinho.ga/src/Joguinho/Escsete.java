package Joguinho;

import java.util.Scanner;

public class Escsete {

	public static void Escolhasete() {
		Scanner meuScan = new Scanner (System.in);
		int n1;
		int n2;
		System.out.println("Após você retornar para dentro de casa, depois de ler, você percebe varios zumbis se aproximando da sua casa");
		System.out.println("1:Fugir para o predio ao lado");
		System.out.println("2:Lutar com os zumbis");
		n1 = meuScan.nextInt();
		if(n1==1) {
			System.out.println("Você chegou no predio e percebe que os zumbis estao te perseguindo.");
			System.out.println("1:Fugir para dentro do predio");
			System.out.println("2:Lutar com os zumbis");
			n2 = meuScan.nextInt();
			if(n2==1) {
				System.out.println("Você conseguiu despistar os zumbis e entrou em um apartamento");
				(Main.Velocidade)=(Main.Velocidade)+1;
				}
				System.out.println("+1 adicionado a Velocidade, Velocidade= "+(Main.Velocidade));
			if(n2==2) {
				if(Main.Força >=8) {
					System.out.println("Você derrotou os zumbis, por ser mais forte que eles");
					(Main.Força)=(Main.Força)+2;
					System.out.println("+2 adicionado a Força, Força= "+(Main.Força));
					System.out.println("Após isso, você entra no predio e decide ficar em um apartamento qualquer");
				}
				if(Main.Força <=7) {
					System.out.println("Você morreu, por ser fraco");
					System.exit(1);
				}
			}
			}
		if(n1==2){
			if(Main.Força >=8) {
				System.out.println("Você derrotou os zumbis, por ser mais forte que eles");
				(Main.Força)=(Main.Força)+2;
				System.out.println("+2 adicionado a Força, Força= "+(Main.Força));
				System.out.println("Após isso, você entra no predio e decide ficar em um apartamento qualquer");
			}
			if(Main.Força <=7) {
				System.out.println("Você morreu, por ser fraco");
				System.exit(1);
		}
			
		}
	}
}