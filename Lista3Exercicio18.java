package Lista3Mauricio;

import java.util.Scanner;

public class Lista3Exercicio18 {

	public static void main(String[] args) {
		double preco,i;
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite o valor do carro: ");
		preco = ent.nextDouble();
		for(i = 6;i < 78;i++) {
			if(i == 6) {System.out.printf("\n%.0f Parcelas \nPreço: %.2f ",i,preco + preco * 0.03);}
			if(i == 12) {System.out.printf("\n%.0f Parcelas \nPreço: %.2f ",i,preco + preco * 0.06);}
			if(i == 18) {System.out.printf("\n%.0f Parcelas \nPreço: %.2f ",i,preco + preco * 0.09);}
			if(i == 24) {System.out.printf("\n%.0f Parcelas \nPreço: %.2f ",i,preco + preco * 0.12);}
			if(i == 30) {System.out.printf("\n%.0f Parcelas \nPreço: %.2f ",i,preco + preco * 0.15);}
			if(i == 36) {System.out.printf("\n%.0f Parcelas \nPreço: %.2f ",i,preco + preco * 0.18);}
			if(i == 42) {System.out.printf("\n%.0f Parcelas \nPreço: %.2f ",i,preco + preco * 0.21);}
			if(i == 48) {System.out.printf("\n%.0f Parcelas \nPreço: %.2f ",i,preco + preco * 0.24);}
			if(i == 54) {System.out.printf("\n%.0f Parcelas \nPreço: %.2f ",i,preco + preco * 0.27);}
			if(i == 60) {System.out.printf("\n%.0f Parcelas \nPreço: %.2f ",i,preco + preco * 0.30);}
			if(i == 72) {System.out.printf("\nValor à vista: %.2f ",preco - preco * 0.20 );}

			
		}
		
	}

	}
