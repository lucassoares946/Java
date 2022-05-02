package Lista3Mauricio;

import java.util.Scanner;

public class Lista3Exercicio36 {

	public static void main(String[] args) {
		double idade = 1,altura,media = 0,i = 0;
		Scanner ent = new Scanner(System.in);
		while(idade > 0) {
		System.out.println("Digite sua idade");
		idade = ent.nextDouble();
		System.out.println("Digite sua altura");
		altura = ent.nextDouble();
		if(idade >= 50) {
			media += altura;
			i++;
		}
		
		if(idade <= 0) {
			System.out.println("Média das alturas pessoas com mais de 50: " + media / i);
		}
		
		
		}

	}

}
