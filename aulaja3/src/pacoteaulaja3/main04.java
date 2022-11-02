 package pacoteaulaja3;

 import java.util.Scanner;
 
public class main04 {

	public static void main(String[] args) {
		float C, F, K;
		Scanner meuScan = new Scanner(System.in);
		System.out.println("Informe a temperatura em graus Celsius");
		C = meuScan.nextInt();
		F = (C * 1.8f) + 32f;
		K = (C + 273.15f);
		System.out.println("A temperatura em graus F é: "+ F);
		System.out.println("A temperatura em graus F é: "+ K);

	}

}
