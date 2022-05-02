package Lista3Mauricio;

import java.util.Scanner;

public class Lista3Exercicio12 {

	public static void main(String[] args) {
		double idade, altura, peso,i,cont = 0,cont2 = 0,cont3 = 0;
		Scanner ent = new Scanner(System.in);
		for(i = 0; i < 25;i++) {
			System.out.println("Digite sua idade: ");
			idade = ent.nextDouble();
			System.out.println("Digite sua altura: ");
			altura = ent.nextDouble();
			System.out.println("Digite seu peso: ");
			peso = ent.nextDouble();
			if(idade > 50) {cont++;}
			else if(idade >= 10 && idade <= 20) {cont2++;}
			else if(peso < 40) {cont3++;}
			
		}
		

	}

}
