package Lista3Mauricio;

import java.util.Scanner;



public class LIsta3Exercicio30 {

	public static void main(String[] args) {
		double codigo = 1,preco,cont = 0,conta = 0,precom = 0;
		Scanner ent = new Scanner(System.in);
		while(codigo > 0) {
		System.out.println("Digite o c�digo do produto: ");
		codigo = ent.nextDouble();
		System.out.println("Digite o pre�o do produto: ");
		preco = ent.nextDouble();
		precom += preco;
		System.out.println("C�digo:" + codigo);
		System.out.println("Novo pre�o: " + (preco + preco * 0.20));
		cont++;
		}
		if(codigo <= 0) {
		System.out.println("M�dia: " + precom / cont);
		System.out.println("M�dia com aumento: " + (precom + precom * 0.20) / cont);
		}
		

	}

}
