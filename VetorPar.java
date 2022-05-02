package Lista3Mauricio;

import java.util.Scanner;

public class VetorPar {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int i;
		int vet[] = new int[11];
		System.out.println("Vetores pares");
		for(i = 0; i < 10;i++) {
			System.out.println("Digite o valor do vetor " + i );
			vet[i] = ent.nextInt();
		}
		for(i = 0; i < 10;i++)
		if(vet[i] % 2 == 0) {System.out.printf("%5d",vet[i] );}
	
	}
		
		
	}


