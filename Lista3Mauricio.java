package Lista3Mauricio;

import java.util.Scanner;

public class Lista3Mauricio {

	public static void main(String[] args) {
		double n, s, i;
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite o valor para a soma");
		n = ent.nextDouble();
		s = 1;
		for(i = 0;i <= n; i++) {
			if(n !=0)
					{System.out.printf("\nO resultado da soma é %.2f" ,s + 1/i);}
		
		}
		
	}

}
