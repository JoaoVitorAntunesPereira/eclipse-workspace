package projetinho;

import java.util.Scanner;

public class Main04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, a;
		try (Scanner meuScan = new Scanner(System.in)){
			num = meuScan.nextInt();
		}
		a=num%2;
		if (a==0){
			System.out.print("Este número é par");
		}
		else {
			System.out.print("Este número não é par");
		}
	}

}