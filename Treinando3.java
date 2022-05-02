package Lista3Mauricio;

import java.util.Scanner;

public class Treinando3 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double valor;
		System.out.println("Digite seu saldo");
		valor = ent.nextDouble();
		System.out.println("Seu novo saldo com juros de 1% é: "+(valor + valor * 0.01));
		

	}

}
