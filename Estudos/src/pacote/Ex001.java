package pacote;

import java.util.Scanner;

public class Ex001 {
	
	public int day;
	public Scanner Scan = new Scanner(System.in);
	
	public void Ex1() {
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String i : cars) {
		  System.out.println(i);
		}
	}
	public void Ex2() {
		System.out.print("Digite um número de 1 a 7 para um dia da semana: ");
		day = Scan.nextInt();
		if(day>=1 || day<=7) {
			Switch();
		}else
		if(day>7) {
			
		}
		
	}
	public void Switch() {
		switch (day) {
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		    default:
				System.out.println("Você digitou um número fora dos falados");
				Ex2();
		}
	}
}
