package atividades;

import java.util.Scanner;

public class Media_v1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, media;
		
		System.out.println("Digite a nota 1: ");
		n1 = sc.nextDouble();
		
		System.out.println("Digite a nota 2: ");
		n2 = sc.nextDouble();
		
		media = (n1+n2)/2;
		
		sc.close();
		
		if(media >= 9) {
			System.out.println("Aprovado com excelência!");
		}else if(media < 9 && media >=6){
			System.out.println("Aprovado");
		}else if(media < 6 && media >= 4) {
			System.out.println("Recuperacao, faca a N3");
		}else if(media < 4) {
			System.out.println("Reprovado");
		}
	}
}
