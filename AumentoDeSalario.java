package Lista3Mauricio;

import java.util.Scanner;

public class AumentoDeSalario {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int i;
		double vet[] = new double[8];
		for(i = 0; i < 8;i++) {
			System.out.println("Digite o valor do sálario " + (i+1));
			vet[i] = ent.nextDouble();
		}
		for(i = 0; i < 8;i++) {
			System.out.printf(" \nValor salarios reajustado %.2f",(0.12 * vet[i]) + vet[i]);}
			

		

	}

}
