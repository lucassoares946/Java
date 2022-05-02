package Lista3Mauricio;

import java.util.Scanner;



public class LIsta3Exercicio30 {

	public static void main(String[] args) {
		double codigo = 1,preco,cont = 0,conta = 0,precom = 0;
		Scanner ent = new Scanner(System.in);
		while(codigo > 0) {
		System.out.println("Digite o código do produto: ");
		codigo = ent.nextDouble();
		System.out.println("Digite o preço do produto: ");
		preco = ent.nextDouble();
		precom += preco;
		System.out.println("Código:" + codigo);
		System.out.println("Novo preço: " + (preco + preco * 0.20));
		cont++;
		}
		if(codigo <= 0) {
		System.out.println("Média: " + precom / cont);
		System.out.println("Média com aumento: " + (precom + precom * 0.20) / cont);
		}
		

	}

}
