package Joguinho;

import java.util.Scanner;

public class Main {

	public static int Força=6;
	public static int Velocidade=6;
	public static int Reflexos=2;
	public static int Inteligencia=5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner meuScan = new Scanner (System.in);

		int n15;
		int n16;
		
		Inicio objeto;
		objeto = new Inicio();
		objeto.Introducao();
		
		escum objeto2;
		objeto2 = new escum();
		objeto2.Escolhaum();
		
		Escdois objeto3;
		objeto3 = new Escdois();
		objeto3.Escolhadois();
		
		Esctres objeto4;
		objeto4 = new Esctres();
		objeto4.Escolhatres();
		
		Escqutro objeto5;
		objeto5 = new Escqutro();
		objeto5.Escolhaquatro();
		
		Esccinco objeto7;
		objeto7 = new Esccinco();
		objeto7.Escolhacinco();
		
		Escseis objeto8;
		objeto8 = new Escseis();
		objeto8.Escolhaseis();
		
		Escsete objeto9;
		objeto9 = new Escsete();
		objeto9.Escolhasete();
		
		Escoito objeto10;
		objeto10 = new Escoito();
		objeto10.Escolhaoito();
		
		Escnove objeto11;
		objeto11 = new Escnove();
		objeto11.Escolhanove();
		
		System.out.println("'Você está entrando no laboratório, deseja continuar?'");
		System.out.println("1: Acho que sim");
		System.out.println("2: Acho que não (jogo finaliza)");
		n16 = meuScan.nextInt();
		if(n16==1){
		Lab objeto6;
		objeto6 = new Lab();
		objeto6.Laboratorio();
		}
		if(n16==2) {
			System.exit(1);
		}
	}
}
