package Lista3Mauricio;

import java.util.Scanner;

public class Lista3Exercicio34 {

	public static void main(String[] args) {
		double voto = 1,cont1 = 0,cont2 = 0,cont3 = 0,cont4 = 0,cont5 = 0,cont6 = 0,i = 0;
		Scanner ent = new Scanner(System.in);
		while(voto != 0) {
		System.out.println("Digite seu voto  \n1.Candidato 1 \n2.Candidato 2 \n3.Candidato 3 \n4.Candidato 4 \n5.Nulo 5 \n6.Voto em Branco");
		voto = ent.nextDouble();
		
		if(voto == 1) {
			cont1++;
			i++;
		}
		
		if(voto == 2) {
			cont2++;
			i++;
		}
		
		if(voto == 3) {
			cont3++;
			i++;
		}
		
		if(voto == 4) {
			cont4++;
			i++;
		}
		
		if(voto == 5) {
			cont5++;
			i++;
		}
		
		if(voto == 6) {
			cont6++;
			i++;
		}
		if(voto == 0) {
		System.out.printf("1.Candidato 1 (%.0f) \n2.Candidato 2 (%.0f) \n3.Candidato 3 (%.0f) \n4.Candidato 4 (%.0f) \n5.Nulo 5 (%.0f) \n6.Voto em Branco (%.0f)",cont1,cont2,cont3,cont4,cont5,cont6);
		System.out.printf("\nPorcentagem de votos nulos sobre o total de votos:%.2f%%", cont5 / i);
		System.out.printf("\nPorcentagem de votos nulos sobre o total de votos:%.2f%%", cont6 / i);
		
		}
		}

	}

}
