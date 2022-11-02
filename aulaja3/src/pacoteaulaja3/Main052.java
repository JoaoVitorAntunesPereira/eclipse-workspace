package pacoteaulaja3;

import java.util.Scanner;

public class Main052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float res,a1,a2;
		Scanner Scan = new Scanner(System.in);
		System.out.println("Para soma digite 1. Para subtração digite 2. Para multiplicação digite 3. Para divisão digite 4.");
		res = Scan.nextInt();
		System.out.print("Informe o 1° número: ");
		a1 = Scan.nextInt();
		System.out.print("Informe o 2° número");
		a2 = Scan.nextInt();
		if (res==1) {
			System.out.print("A soma é: "+ (a1+a2));
		}
		else if(res==2) {
			System.out.print("A subtração é: "+ (a1-a2));
		}
		else if (res==3) {
			System.out.print("A multiplicação é: "+ (a1*a2));
		}
		else if (res==4) {
			System.out.print("A divisão é: "+ (a1/a2));
		}
	}	

}
