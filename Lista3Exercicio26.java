package Lista3Mauricio;

import java.util.Scanner;

public class Lista3Exercicio26 {

	public static void main(String[] args) {
		double idade = 1,media = 0,cont = 0;
		Scanner ent = new Scanner(System.in);
		
		while(idade != 0) {
			System.out.println("Digite sua idade: ");
			idade = ent.nextDouble();
			cont++;
			media += idade;
		
		
		{
			
			}
		if(idade == 0) {
			System.out.println("Média: " + media / cont);
		}

	}

	}
}
