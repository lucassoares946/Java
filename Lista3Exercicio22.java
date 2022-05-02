package Lista3Mauricio;

import java.util.Scanner;

public class Lista3Exercicio22 {

	public static void main(String[] args) {
		double idade,peso,pesoa = 0,pesob= 0,pesoc =0,pesod = 0,i,cont1 = 0,cont2 = 0,cont3 = 0,cont4 = 0;
		Scanner ent = new Scanner(System.in);
		
		for(i = 0;i < 15;i++) {
			System.out.println("Digite sua idade: ");
			idade = ent.nextDouble();
			System.out.println("Digite seu peso: ");
			peso = ent.nextDouble();
			
			if(idade >= 1 && idade <= 10) {
				cont1++;
			pesoa += peso;
			}
			
			if(idade >= 11 && idade <= 20) {
				cont2++;
			pesob += peso;
			}
			
			if(idade >= 21 && idade <= 30) {
				cont3++;
			pesoc += peso;
			}
			
			if(idade > 31) {
				cont1++;
			pesod += peso;
			}
			
		}
		System.out.println("Média de pesos de 1 a 10 anos: " + pesoa / i);
		System.out.println("Média de pesos de 11 a 20 anos: " + pesob / i);
		System.out.println("Média de pesos de 21 a 30 anos: " + pesoc / i);
		System.out.println("Média de peso pessoas com mais de 31 anos: " + pesod / i);
	}

}
