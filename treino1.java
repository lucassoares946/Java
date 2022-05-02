package Lista3Mauricio;

import java.util.Scanner;

public class treino1 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double c = 0,f,k,re,ra;
		f = c * 1.8 + 32;
		k = c + 273.15;
		re = c * 0.8;
		ra = c* 1.8 + 32 + 495.67;
		System.out.println("Digite a temperatura em Cº");
		c = ent.nextDouble();
		System.out.printf("F %.2f K %.2f RE %.2f RA %.2f ",f,k,re,ra);
		
				

	}

}
