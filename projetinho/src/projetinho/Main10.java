package projetinho;

import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int num;
		int q = 0;
		try(Scanner meuScan = new Scanner(System.in)){
		for(int i = 1;i<=10; i++) {
			System.out.print("Informe o "+Integer.toString(i)+ "° número");
				a = meuScan.nextInt();
				num = a%2;
				if(num==0) {
					q+=1;
				}
			}
		System.out.println("Foram digitados "+Integer.toString(q)+" números pares.");
	}
}
}
