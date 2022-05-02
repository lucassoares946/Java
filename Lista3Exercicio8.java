package Lista3Mauricio;

import java.util.Scanner;

public class Lista3Exercicio8 {

	public static void main(String[] args) {
	double idade,pri = 0,seg = 0,ter = 0,quar = 0,quin = 0,porcenpri,porcenseg,i;
	
	
	
	Scanner ent = new Scanner(System.in);
	for(i = 0; i < 15;i++) {System.out.println("\nDigite sua Idade ");
	idade = ent.nextDouble();
	if(idade <= 15)pri++;
	else if(idade >= 16 && idade <= 30)seg++; 
	else if(idade >= 31 && idade <= 45)ter++; 
	else if(idade >= 46 && idade <= 60)quar++; 
	else if(idade > 61)quin++;
	System.out.println("Quantidade de pessoas com até 15 anos: " + pri);
	System.out.println("Quantidade de pessoas com 16 até 30 anos: " + seg);
	System.out.println("Quantidade de pessoas com 31 até 45 anos: " + ter);
	System.out.println("Quantidade de pessoas com 46 até 60 anos: " + quar);
	System.out.println("Quantidade de pessoas com mais de 61 anos: " + quin);
	System.out.printf("Porcentagem de pessoas na primeira faixa etária:%.2f%%  ", pri / 15 * 100 );
	System.out.printf("\nPorcentagem de pessoas na primeira faixa etária:%.2f%%  ", quin /15 * 100 );

}
}
}