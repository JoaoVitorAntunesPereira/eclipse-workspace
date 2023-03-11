package Joguinho;

import java.util.Scanner;

public class Lab {
	public static void Laboratorio() {
	int n1;
	Scanner meuScan = new Scanner (System.in);
	System.out.println("Você entrou no Laboratorio, esse local que a cura sera desenvolvida");
	System.out.println("Logo se depara com 3 zumbis");
	System.out.println("Você é obrigado a lutar com os zumbis.");
	if(Main.Força<=7){
		 System.out.println("Você morreu por ser fraco");
		 System.exit(1);
	 }if(Main.Força>=8){
		 System.out.println("Você derrotou os zumbis");
		 System.out.println("Você olha para o lado e acha uma porta, você entra na porta.");
		 System.out.println("Quando a porta é aberta, voam 3 flechas em sua direção");
		 if(Main.Reflexos<=3){
			 System.out.println("Você morreu por ser lerdo");
			 System.exit(1);
	 }
		 if(Main.Reflexos>=4){
			 System.out.println("Você consegue desviar das flechas");
			 System.out.println("Após você desviar das flechas, você percebe que a sala fechou e esta se enchendo de gás tóxico");
			 System.out.println("Você consegue ver uma porta no final do corredor.");
			 System.out.println("Mas o gás ja esta afetando seu fisico e a sua mente");
			 System.out.println("Você resolve correr em direção da porta, já que é a unica opção que você tem.");
			 if(Main.Velocidade<=7) {
				 	System.out.println("Você morreu por ser lento.");
					System.exit(1);
			 }
			if(Main.Velocidade>=8) {
				System.out.println("Você entrou na porta e fechou ela rapidamente.");
				System.out.println("Você olha ao seu redor e acha um livro");
				System.out.println("'Passarei as informações de como fazer a cura por aqui.'");
				System.out.println("'Não posso faze-la, pois fui mordido...'");
				System.out.println("'A receita é....'");
				System.out.println("Na mesma hora, um zumbi te ataca pelas costa, era ele, o autor desse livro");
				System.out.println("1: Desviar do ataque");
				System.out.println("2: Atacar o zumbi");
				n1 = meuScan.nextInt();
				if(n1==1) {
					if(Main.Reflexos>=4) {
						System.out.println("Você desviou do ataque");
						System.out.println("Após isso, você ataca o zumbi e o derrota");
						if(Main.Inteligencia>=8) {
							System.out.println("Parabens, você completou o jogo e conseguiu fazer a cura!!");
						}
						if(Main.Inteligencia<=7) {
							System.out.println("Você nao conseguiu fazer a cura e morreu por fazer misturas errada. Você morreu por falta de Inteligencia.");
							System.exit(1);
						}
					}
					if(Main.Reflexos<=3) {
						System.out.println("Você morreu por ser lerdo");
						 System.exit(1);
					}
				}
				if(n1==2) {
					if(Main.Força>=10) {
						System.out.println("Você lutou com o zumbi e ganhou");
						}
					if(Main.Força<=9) {
						System.out.println("Você morreu por ser fraco");
						System.exit(1);

							}
			 			
					if(Main.Inteligencia>=8) {
						System.out.println("Parabéns, você completou o jogo e conseguiu fazer a cura!!");
					}
					if(Main.Inteligencia<=7) {
						System.out.println("Você nao conseguiu fazer a cura e morreu por fazer misturas errada. Você morreu por falta de Inteligencia.");
						System.exit(1);
					}
			 	}
		 	}
	 	}
	}
}
}