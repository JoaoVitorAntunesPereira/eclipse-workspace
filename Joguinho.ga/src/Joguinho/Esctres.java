package Joguinho;

import java.util.Scanner;

public class Esctres {
	public static void Escolhatres() {
	Scanner meuScan = new Scanner (System.in);
	int n1;
	int n2;
	System.out.println("1:Lutar com o zumbi");
	 System.out.println("2:Correr para dentro do mercado");
	 n1 = meuScan.nextInt();
	 if(n1==1){
		 if(Main.Força>=6){
			 System.out.println("Você matou o zumbi, por ter mais força que ele");
			(Main.Força)=(Main.Força)+1;
			 System.out.println("+1 adicionado a Força, Força= "+(Main.Força));
			 System.out.println("Após isso, voce entra no Mercado");
			 System.out.println("Após coletar os recursos, retora para casa");
		 }
		 if(Main.Força<=5){
			 System.out.println("Você morreu.");
			 System.exit(1);
		 }
	 }
	 if(n1==2){
		 System.out.println("Após isso, voce entra no Mercado.");
		 System.out.println("Você coleta alguns recursos e percebe um zumbi vindo em su direção.");
		 System.out.println("1:Correr para casa.");
		 System.out.println("2:Lutar com o zumbi.");
		 n2 = meuScan.nextInt();
		 if(n2==1){
				System.out.println("Após isso, você chegou em casa");
				(Main.Velocidade)=(Main.Velocidade)+1;

		 			}
		 if(n2==2){
			 	if(Main.Força>=6){
			 	System.out.println("Você matou o zumbi, por ter mais força que ele");
				(Main.Força)=(Main.Força)+1;
				 System.out.println("+1 adicionado a Força, Força= "+(Main.Força));
			 }
			 	if(Main.Força<=6){
				System.out.println("Você morreu");
				 System.exit(1);
				}
		 	}	
	 	}
	}
}