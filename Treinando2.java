package Lista3Mauricio;

import java.util.Scanner;

public class Treinando2 {

	public static void main(String[] args) {
	Scanner ent = new Scanner(System.in);
	double oito = 8,nove = 9 ,sete = 7,quatro = 4, cinco = 5, seis = 6,cal,cal2;
	System.out.println("Média de "+ oito + "  " + nove + "  " + sete);
	cal = (oito + nove + sete)  / 3;
	System.out.println("Resultado //////////////////"+ cal + "////////////////////");
	System.out.printf("Média de %.0f      %.0f      %.0f",quatro,cinco,seis);
	cal2 = (quatro + cinco + seis)/3;
	System.out.printf("\nResultado %.0f",cal2);

	}

}
