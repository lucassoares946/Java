package Lista3Mauricio;

import java.util.Scanner;

public class VetorParOuImpar {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int vet[] = new int[12];
		System.out.println("Vetor de 12 elementos - par ou �mpar");
		for(int i = 0;i < 12;i++) {
		System.out.println("Digite vet[" + i + "]:");
		vet[i] = ent.nextInt();
		}
		System.out.println("Classifica��o do vetor - par ou �mpar:");
		for(int i = 0;i < 12;i++) {
		if(vet[i] % 2 == 0) { //vet[i] � par
		System.out.println(vet[i] + " - � PAR!");
		}
		else { //vet[i] � �mpar
		System.out.println(vet[i] + " - � �MPAR!");
	}

}
	
}
}