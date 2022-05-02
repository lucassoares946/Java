package Lista3Mauricio;

import java.util.Scanner;

public class Lista3Exercicio24 {

	public static void main(String[] args) {
		double sexo,opiniao,conts = 0,contn = 0,contms = 0,conth = 0,i;
		Scanner ent = new Scanner(System.in);
		for(i = 0;i < 10; i++) {
		System.out.println("Digite seu sexo 1.Homem 2.Mulher");
		sexo = ent.nextDouble();
		System.out.println("Gostou do novo produto 1.Sim 2.Não");
		opiniao = ent.nextDouble();
		if(opiniao == 1) {
		conts++;
		}
		
		if(opiniao == 2) {
		contn++;
		}
		
		if(opiniao == 1 && sexo == 2) {
			contms++;
			
		}
		
		if(opiniao == 2 && sexo == 1) {
			conth++;
			
		}
		}
		
		System.out.println("Pessoas que responderam sim: " + conts);
		System.out.println("Pessoas que responderam não: " + contn);
		System.out.println("Mulheres que responderam sim: " + contms);
		System.out.println("Porcetagem de Homens que responderam não: " + conth / 100);
		
		}

	}



