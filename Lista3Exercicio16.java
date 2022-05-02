package Lista3Mauricio;

import java.util.Scanner;

public class Lista3Exercicio16 {

	public static void main(String[] args) {
		double i,peso,altura,idade,soma = 0,cont1 = 0,cont2 = 0;
		Scanner ent = new Scanner(System.in);
		for(i = 0;i < 10;i++) {
		System.out.println("Digite sua idade: ");
		idade = ent.nextDouble();
		System.out.println("Digite sua altura: ");
		altura = ent.nextDouble();
		System.out.println("Digite seu peso: ");
		peso = ent.nextDouble();
		soma += idade;
		if(peso > 90 && altura < 1.50) {cont1++;}
		if(idade >= 10 && idade <= 30 && altura > 1.90) {cont2++;}
		
		

	}
		System.out.println("A média das idades é: " + soma / 10);
		System.out.println("Pessoas com mais de 90 Kg e Altura Menor que 1,50m: "+ cont1);
		System.out.println("Pessoas com idade entre 10 e 30 que medem mais de 1,90m: "+ cont2);
	}
}
