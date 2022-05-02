package Lista3Mauricio;

import java.util.Scanner;

public class LIsta3Exercicio14 {

	public static void main(String[] args) {
		double i,idade,peso,altura,olho,cabelo,cont1 = 0,cont2 = 0,cont3 = 0,cont4 =0;
		String a,p,v,c,l,r;
		Scanner ent = new Scanner(System.in);
		for(i = 0; i < 20;i++) {
			System.out.println("Digite sua idade: ");
			idade = ent.nextDouble();
			System.out.println("Digite seu peso: ");
			peso = ent.nextDouble();
			System.out.println("Digite sua altura: ");
			altura = ent.nextDouble();
			System.out.println("Digite a cor dos seus olhos: ");
			olho = ent.nextDouble();
			System.out.println("Digite a cor dos seus cabelos: ");
			cabelo = ent.nextDouble();
			if(idade > 50 && peso < 60) {cont1++;}
			System.out.println("Pessoas com mais de 50 anos e com menos de 60 Kg:" + cont1);
			if(altura < 1.50) {cont2++;}
			System.out.println("média das idades de pessoas com menos de 1,50 " + cont2 / 20);
			if(olho == 'a') {cont3++;}
				System.out.println("Percetagem de pessoas com olhos azuis " + cont3 / 100);
				if(cabelo == 'r' && olho != 'a') {cont4++;}
				System.out.println("Pessoas ruivas que não tem olhos azuis " + cont4);
				
		}

	}

	}
