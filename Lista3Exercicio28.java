package Lista3Mauricio;

import java.util.Scanner;

public class Lista3Exercicio28 {

	public static void main(String[] args) {
		double salario = 1,filhos,salarioa = 0,cont = 0,filhosa = 0,maior = 0,menor = 0,cont150 = 0;
		Scanner ent = new Scanner(System.in);
		    while(salario > 0) {
			System.out.println("Digite seu salário: ");
			salario = ent.nextDouble();
			System.out.println("Digite quantos filhos você tem: ");
			filhos = ent.nextDouble();
			salarioa += salario;
			filhosa += filhos;
			cont++;
		    }
			if(salario < menor) {
				salario += menor;
				
			}
			if(salario > maior) {
				salario += maior;
			
			}
			if(salario <= 150 ) {
				cont150++;
			}
		
		 {
		System.out.println("Média do salário da população: " + salarioa / cont);
		System.out.println("Média de filhos: " + filhosa / cont);
		System.out.println("Maior salário: " + maior);
		System.out.println("Pessoas com salário até R$150: " + cont150);
		}
		
		
	}

}

