package Lista3Mauricio;

import java.util.Scanner;

public class Treinando4 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double ipi,cod,valor,cal,quant,cod2,valor2,quant2;
		System.out.println("Digite  a porcentagem de IPI");
		ipi = ent.nextDouble();
		ipi = (ipi * 0.01);
		System.out.println("Digite o codigo");
		cod =  ent.nextDouble();
		System.out.println("Digite o valor da pe�a");
		valor = ent.nextDouble();
		System.out.println("Digite a quantidade de pe�as");
		quant = ent.nextDouble();
		
		System.out.println("Digite o codigo");
		cod2 =  ent.nextDouble();
		System.out.println("Digite o valor da pe�a");
		valor2 = ent.nextDouble();
		System.out.println("Digite a quantidade de pe�as");
		quant2 = ent.nextDouble();
		
		cal = (valor*quant+valor2*quant2)*(ipi+1);
		
		System.out.println("\nValor total "+ cal + "\nCod da pe�a 1 " + cod + "\nPre�o "+ valor+ "\nCod pe�a 2 "+ cod2 + "\nPre�o " + valor2);
		
		
	}

}
