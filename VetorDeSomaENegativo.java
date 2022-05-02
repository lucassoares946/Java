package Lista3Mauricio;

import java.util.Scanner;

public class VetorDeSomaENegativo {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double contanegativos=0,somapositivos=0;
		double vet[] = new double[10];
		System.out.println("Vetor de 10 números reais - Soma Positivos e Conta Negativos");
		System.out.println("Leitura do Vetor");
		System.out.println("================");
		for(int i = 0; i < 10; i++) {
		System.out.println("Digite vet["+i+"]:");
		vet[i] = ent.nextDouble();
		if(vet[i] > 0) { somapositivos += vet[i]; }
		else if(vet[i] < 0) { contanegativos++; }
		}
		System.out.println("Impressão do Vetor");
		System.out.println("==================");
		System.out.printf("\n\n");
		for(int i = 0; i < 10; i++) {
		System.out.printf("%.2f\n",vet[i]);
		}
		System.out.printf("\n\nSoma dos números positivos: %.2f", somapositivos);
		System.out.printf("\n\nHá %.0f números negativos no vetor",contanegativos);
		
	}

}
