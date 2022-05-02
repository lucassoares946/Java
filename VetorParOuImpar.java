package Lista3Mauricio;

import java.util.Scanner;

public class VetorParOuImpar {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int vet[] = new int[12];
		System.out.println("Vetor de 12 elementos - par ou ímpar");
		for(int i = 0;i < 12;i++) {
		System.out.println("Digite vet[" + i + "]:");
		vet[i] = ent.nextInt();
		}
		System.out.println("Classificação do vetor - par ou ímpar:");
		for(int i = 0;i < 12;i++) {
		if(vet[i] % 2 == 0) { //vet[i] é par
		System.out.println(vet[i] + " - é PAR!");
		}
		else { //vet[i] é ímpar
		System.out.println(vet[i] + " - é ÍMPAR!");
	}

}
	
}
}