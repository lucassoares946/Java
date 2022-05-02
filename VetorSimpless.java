package Lista3Mauricio;

import java.util.Scanner;

public class VetorSimpless {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int vet[] = new int[10];
		int i;
		System.out.println("Vetor de 10 elementos inteiros");
		//Leitura do Vetor de 10 elementos inteiros:
		for(i=0;i<10;i++) {
		System.out.println("Digite vet["+i+"]: ");
		vet[i] = ent.nextInt();
		}
		System.out.println("Vetor de 10 elementos na tela: ");
		for(i=0;i<10;i++) {
		System.out.printf("%5d",vet[i]);
		}
		}
		
	}

