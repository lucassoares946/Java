package Lista3Mauricio;

import java.util.Scanner;

public class Treinando1 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double ano,mes,dia,idade,base = 2022,cal;
		System.out.println("Digite o ano do seu nascimento:");
		ano = ent.nextDouble();
		cal= base - ano;
		System.out.println("Digite o mês:");
		mes = ent.nextDouble();
		System.out.println("Digite o Dia:");
		dia = ent.nextDouble();
		System.out.printf("Sua idade em dias é: %.0f",(cal * 365 + mes * 30 + dia));
		
		
		

	}

}
