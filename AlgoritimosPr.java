package Lista3Mauricio;

import java.util.Scanner;

public class AlgoritimosPr {

	public static void main(String[] args) {
		double a,b,c,x1 = 0,x2 = -5,x3 = -32;
		Scanner ent = new Scanner(System.in);
		System.out.println("f(0) = a²*x+b*x+c");
		System.out.println("Digite o primeiro numero");
		a = ent.nextDouble();
		System.out.println("Digite o segundo numero");
		b = ent.nextDouble();
		System.out.println("Digite o terceiro numero");
		c = ent.nextDouble();
		System.out.printf("Resultado da equação %.2f",(a * a)*x2+b*x3+c);
		

	}

}
