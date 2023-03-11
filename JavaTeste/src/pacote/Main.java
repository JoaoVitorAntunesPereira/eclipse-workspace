package pacote;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1 = 0, i,a2 = 0,j;
		Scanner scan = new Scanner(System.in);
		System.out.println("a1: ");
		a1=scan.nextInt();
		System.out.println("a2: ");
		a2=scan.nextInt();
		int mult=1;
		for(i=a1; i>1; i--){		
		    mult=mult*i;
		}
		int mult2=1;
		for(j=a2; j>1; j--){		
		    mult2=mult2*j;
		}
		int mult3=1;
		for(j=(a1-a2); j>1; j--){		
		    mult3=mult3*j;
		}
		double fat = mult/(mult2*mult3);
	System.out.println(mult);
	System.out.println(mult2);
	System.out.println(fat);
	}
}