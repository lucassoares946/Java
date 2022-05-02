package Lista3Mauricio;

import java.util.Scanner;

public class Lista3Exercicio32 {

	public static void main(String[] args) {
		double num = 1,cont35 = 0,i = 0,cont50 = 0,cont10 = 0,media = 0,contmen = 0;
		Scanner ent = new Scanner(System.in);
		while(num > 0) {
			System.out.println("Digite um número: ");
			num = ent.nextDouble();
			i++;
			if(num < 35) {
				cont35++;
				
			}
			
			if(num > 0) {
				num += media;
				
				
			}
			
			if(num >= 50 && num <= 100) {
				cont50++;
			}
			
			if(num >= 10 && num <= 20) {
				cont10++;
				
			}
			
			if(num < 50) {
				contmen++;
			}
		}
			if(num  ==0){
			System.out.println("Números menores que 35: " + cont35);
			System.out.println("média dos números: " + media / i);
			System.out.println("Numeros entre 50 e 100: " + cont50);
			System.out.println("Números entre 10 e 20: " + cont10 / contmen + "%");
			
			
			
			
		}

	}

}
