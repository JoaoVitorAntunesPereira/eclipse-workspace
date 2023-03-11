package Joguinho;

import java.util.Scanner;

public class Escqutro {
	public static void Escolhaquatro() {
		Scanner meuScan = new Scanner (System.in);
		int n1;
		int n2;
		 System.out.println("Quando você chega em casa, percebe que a casa esta meio desprotegida");
		 System.out.println("1:Colocar barricadas");
		 System.out.println("2:Nao colocar a barricada");
		 n1 = meuScan.nextInt();
		 if(n1==1){
			 System.out.println("Você protegeu sua casa");
			 	(Main.Inteligencia)=(Main.Inteligencia)+1;
				System.out.println("+1 adicionado a Inteligencia, Inteligencia= "+(Main.Inteligencia));
				}
		 		System.out.println("Na frente da sua casas, você ve um caderno.");
				System.out.println("Você pega o caderno entra em casa e começa a ler ele");
				System.out.println("'Todos receberam a Janela de Status, faça as escolhas com sabedoria'");
				System.out.println("'Alguns rumores dizem que existe uma cura para tudo isso.'");
				System.out.println("'Falam que a Inteligência é o principal fator, para conseguir criar ela'");
				System.out.println("'Mas lembre-se, Inteligência não é tudo nesse mundo...'");

		
		 if(n1==2){
			 System.out.println("Você morreu a noite, enquanto dormia.");
			 System.exit(1);
		 }
	}
}