package pacote;

import java.util.Scanner;

public class Atividade01 {
	public static void Atividade01(String[] args){
	int  num;
	Scanner meuScan = new Scanner(System.in);
	System.out.print("Informe um número");
	num = meuScan.nextInt();
	System.out.println("O succesor de " + Integer.toString(num + 1) );
	System.out.println("O antecessor de " + Integer.toString(num - 1) );
}
}
