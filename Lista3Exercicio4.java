package Lista3Mauricio;

import java.util.Scanner;



public class Lista3Exercicio4 {

	public static void main(String[] args) {
		int a,b,c,d,i;
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite 4 números e receba em ordem crescente e decrescente");
		System.out.println("Digite:");
		a = ent.nextInt();
		System.out.println("Digite:");
		b = ent.nextInt();
		System.out.println("Digite:");
		c = ent.nextInt();
		System.out.println("Digite:");
		d = ent.nextInt();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(d);
		System.out.println(c);
		System.out.println(b);
		System.out.println(a);
		
		for(i = 0; i < 1;i++) {System.out.println("Digite 1 º n:");
		if(a > b) {
		
		a = ent.nextInt();
		System.out.println("Digite 2 º n:");
		b = ent.nextInt();
		System.out.println("Digite 3 º n:");
		c = ent.nextInt();
		System.out.println("Digite 4 º n:");
		d = ent.nextInt();
		for(i = 0; i < 1;i++)
		if
		(a > b || a > c || a > d && b > c && b > d && d > c) {System.out.println("Decrescente \n"+a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println("===============");
		System.out.println("|   Crescente  |");
		System.out.println("===============");
		System.out.println(d);
		System.out.println(c);
		System.out.println(b);
		System.out.println(a);}
		
		else if
		(a < b || a < c || a < d && b < c && b < d && d < c) {System.out.println("Crescente \n"+a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println("===============");
		System.out.println("| Decrescente |");
		System.out.println("===============");
		System.out.println(d);
		System.out.println(c);
		System.out.println(b);
		System.out.println(a);}
		
		
		
		
		
		
		
			
		}
		}
		}
	}

	


		
		

	



