package Lista3Mauricio;

import java.util.Scanner;

public class Lista3Exercicio38 {

	public static void main(String[] args) {
		double salario = 1,entrada,mes;
		Scanner ent = new Scanner(System.in);
		while(salario > 0) {
			System.out.println("Digite \n1.Novo sal�rio \n2.F�rias \n3.D�cimo terceiro \n4.Sair");
			entrada = ent.nextDouble();
			
			if(entrada == 4) {
				
			}
			
			if(entrada == 3) {
				System.out.println("Digite seu salario");
				salario = ent.nextDouble();
				System.out.println("Digite a quantidade de meses");
				mes = ent.nextDouble();
				System.out.println("D�cimo terceiro" + (salario * mes / 12));
				
			}
			
			if(entrada == 2) 
				System.out.println("Digite seu sal�rio");
				salario = ent.nextDouble();
				System.out.println("Salario de f�rias: " + (salario * 0.33 + salario));
			
			if(entrada == 1) {
				System.out.println("Digite seu sal�rio");
				salario = ent.nextDouble();
			}
			
			if(salario <= 350 && entrada == 1) {
				System.out.println("Seu novo sal�rio �:" + (salario * 0.15 + salario));
				
			}
			
			if(salario >= 350 && salario <= 600 && entrada == 1) {
				System.out.println("Seu novo sal�rio �:" + (salario * 0.10 + salario));
				
			}
			
			if(salario > 600 && entrada == 1) {
				System.out.println("Seu novo sal�rio �:" + (salario * 0.05 + salario));
			}
			
			
			
			
				
			
			
			
			
			
		}

	}

}
