package pacote;

import java.util.Scanner;

import java.util.ArrayList;

public class Caracteristicas {
	
	int Forca = 0;
	int Inteligencia = 0;
	int Carisma = 0;
	int Agilidade = 0;
	public int pontos, pontosiniciais=15, n;
	Scanner Scan = new Scanner(System.in);
	ArrayList <String> caracteristicas = new ArrayList<String>();
	ArrayList caract = new ArrayList();
	
	public void Pontos() {
		caracteristicas.add("Força");
		caracteristicas.add("Intelgência");
		caracteristicas.add("Carisma");
		caracteristicas.add("Agilidade");
		System.out.println("As características são: " + caracteristicas);
		System.out.println("Você tem 15 pontos");
		n=1;
		Switch();
	}
	
	public void Switch() {
		System.out.println("Escolha quantos pontos deseja colocar em cada uma delas");

		switch (n) {
		  case 1:
		    System.out.println("Força");
		    pontos = Scan.nextInt();
		    if(pontos>pontosiniciais) {
		    	System.out.println("Você excedeu os pontos de características");
		    	Switch();
		    }else {
		    	n=2;
			    pontosiniciais -=pontos;
			    Forca += pontos;
			    if(pontosiniciais==0) {
			    	System.out.println("Você zerou seus pontos de característica");
			    	CaracteristicasFinais();
			    }else {
			    	Switch();
			    }
		    }
		    break;
		  case 2:
		    System.out.println("Intelgência");
		    pontos = Scan.nextInt();
		    if(pontos>pontosiniciais) {
		    	System.out.println("Você excedeu os pontos de características");
		    	Switch();
		    }else {
		    	n=3;
			    pontosiniciais -=pontos;
			    Inteligencia += pontos;
			    if(pontosiniciais==0) {
			    	System.out.println("Você zerou seus pontos de característica");
			    	CaracteristicasFinais();
			    }else {
			    	Switch();
			    }
		    }
		    break;
		  case 3:
		    System.out.println("Carisma");
		    pontos = Scan.nextInt();
		    if(pontos>pontosiniciais) {
		    	System.out.println("Você excedeu os pontos de características");
		    	Switch();
		    }else {
		    	n=4;
			    pontosiniciais -=pontos;
			    Carisma += pontos;
			    if(pontosiniciais==0) {
			    	System.out.println("Você zerou seus pontos de característica");
			    	CaracteristicasFinais();
			    }else {
			    	Switch();
			    }
		    }
		    break;
		  case 4:
		    System.out.println("Agilidade");
		    pontos = Scan.nextInt();
		    if(pontos>pontosiniciais) {
		    	System.out.println("Você excedeu os pontos de características");
		    	Switch();
		    }else {
			    pontosiniciais -=pontos;
			    Agilidade += pontos;
			    if(pontosiniciais==0) {
			    	System.out.println("Você zerou seus pontos de característica");
			    	CaracteristicasFinais();
			    }else {
				    CaracteristicasFinais();
			    }
		    }
		    break;
		    default:
				System.out.println("Você digitou um número fora dos falados");
				Pontos();
		}
	}
	public void CaracteristicasFinais() {
		System.out.println("As características finais ficaram:");
		System.out.println("Força: " + Forca);
		System.out.println("Inteligência: " + Inteligencia);
		System.out.println("Carisma: " + Carisma);
		System.out.println("Agilidade: " + Agilidade);
		System.out.print("Se deseja escolher novamente seus pontos digite 1, se deseja prosseguir digite 2:");
		int escolhacaracnovo;
		escolhacaracnovo = Scan.nextInt();
		if(escolhacaracnovo==1) {
			Pontos();
		}else {
			CaracteristicasFinais();
		}
	}
}
