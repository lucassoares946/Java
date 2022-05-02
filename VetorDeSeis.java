package Lista3Mauricio;

import java.util.Scanner;

public class VetorDeSeis {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int contapares=0,contaimpares=0;
		int vet[] = new int[6];
		System.out.println("Vetor de 6 inteiros - classificação: pares e ímpares");
		System.out.println("Leitura do Vetor");
		System.out.println("================");
		for(int i = 0; i< 6; i++) {
		System.out.println("Digite vet[" + i + "]:");
		vet[i] = ent.nextInt();
		if(vet[i] % 2 == 0) { contapares++; }
		else { contaimpares++; }
		}
		System.out.printf("\n\n");
		System.out.println("Impressão do Vetor Original");
		System.out.println("===========================");
		System.out.printf("\n\n");
		for(int i = 0; i< 6; i++) {
		System.out.printf("%5d",vet[i]);
		}
		System.out.printf("\n\n");
		if(contapares != 0) {
		System.out.println("Existem " + contapares + " números pares no vetor: ");
		for(int i = 0; i< 6; i++) {
		if(vet[i] % 2 == 0) { System.out.printf("%5d",vet[i]); }
		}
		}
		else { System.out.println("Não foram digitados pares no vetor!!!!");}
		System.out.printf("\n\n");
		if(contaimpares != 0) {
		System.out.println("Existem " + contaimpares + " números ímpares no vetor: ");
		for(int i = 0; i< 6; i++) {
		if(vet[i] %2 != 0) { System.out.printf("%5d",vet[i]); }
		}
		}
		else { System.out.println("Não foram digitados ímpares no vetor!!!!");}
	}

}
