package projetinho;

import java.util.Scanner;

public class Main06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res= "";
		int a1,a2;
		System.out.println("Você derseja fazer uma soma, uma divisão, uma multiplicação ou uma subtração");
		try (Scanner meuScan = new Scanner(System.in)){
			res = meuScan.nextLine();
			System.out.println("Informe o primeiro número");
			a1 = meuScan.nextInt();
			System.out.println("Informe o segundo número");
			a2 = meuScan.nextInt();
		}
		if(res.equalsIgnoreCase("soma")) {
			System.out.println("A soma entre os dois números é: "+ Integer.toString (a1+a2));
		}
		else if(res.equalsIgnoreCase("divisão")) {
			System.out.println("A divisão dos dois números é: "+ Integer.toString(a1/a2));
		}
		else if(res.equalsIgnoreCase("multiplicação")) {
			System.out.println("A multiplicação entre os dois números é: "+ Integer.toString(a1*a2));
		}
		else if(res.equalsIgnoreCase("subtração")) {
			System.out.println("A subtração dos dois números é: "+ Integer.toString(a1-a2));
		}
	}

}
