package Lista3Mauricio;

import java.util.Scanner;

public class Lista3Exercicio4Certo {

	public static void main(String[] args) {
		double i = 0,a,b,c,d;
		Scanner ent = new Scanner(System.in);
		for(i = 0; i < 5;i++) {
			System.out.println("Digite um numero");
			a = ent.nextDouble();
			System.out.println("Digite um numero");
			b = ent.nextDouble();
			System.out.println("Digite um numero");
			c = ent.nextDouble();
			System.out.println("Digite um numero");
			d = ent.nextDouble();
			if(a != 0)
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			
			if(a > b && b > c && c > d) {
				System.out.println("Decrescente\n");
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
				System.out.println("Crescente\n");
				System.out.println(d);
				System.out.println(c);
				System.out.println(b);
				System.out.println(a);
				
			}
			
			
				
			

			if(b > a && b > c  && d > a) {
				System.out.println("Decrescente\n");
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
				System.out.println(a);
				System.out.println("Crescente\n");
				System.out.println(a);
				System.out.println(d);
				System.out.println(c);
				System.out.println(b);
				
			
		
				
			}
			
			

			if(b > a && d > c  && c > a) {
				System.out.println("Decrescente\n");
				System.out.println(b);
				System.out.println(d);
				System.out.println(c);
				System.out.println(a);
				System.out.println("Crescente\n");
				System.out.println(a);
				System.out.println(c);
				System.out.println(d);
				System.out.println(b);
				
			
		
				
			}
			
			if(c > a && b > d  && d > a) {
				System.out.println("Decrescente\n");
				System.out.println(c);
				System.out.println(b);
				System.out.println(d);
				System.out.println(a);
				System.out.println("Crescente\n");
				System.out.println(a);
				System.out.println(b);
				System.out.println(d);
				System.out.println(c);
				
			
		
				
			}
			
			if(d > a && a > b  && a > d) {
				System.out.println("Decrescente\n");
				System.out.println(d);
				System.out.println(b);
				System.out.println(d);
				System.out.println(a);
				System.out.println("Crescente\n");
				System.out.println(a);
				System.out.println(b);
				System.out.println(d);
				System.out.println(c);
				
			
		
				
			}
			
		}
		

	}
}


