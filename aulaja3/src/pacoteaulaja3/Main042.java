 package pacoteaulaja3;

 import java.util.Scanner;
 
public class Main042 {

	public static void main(String[] args) {
		float temperatura;
		Scanner meuScan = new Scanner(System.in);
		System.out.println("Informe a temperatura em graus Celsius");
		temperatura = meuScan.nextInt();
		System.out.println("A temperatura em graus F é: "+ ((temperatura * 1.8f) + 32f));
		System.out.println("A temperatura em graus K é: "+ ((temperatura + 273.15f)));

	}

}
