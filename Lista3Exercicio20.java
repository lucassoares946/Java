package Lista3Mauricio;

import java.util.Scanner;

public class Lista3Exercicio20 {

	public static void main(String[] args) {
		int maior = 0,menor = 0,num = 0;
		Scanner ent = new Scanner(System.in);
		 do{
			System.out.println("Digite números inteiros: ");
		    num = ent.nextInt();
		   
		    if(num < 0) {System.out.println("Número negativo não participa");}
		   
		    if( maior == 0 && menor == 0 && num > 0) {
		    	 maior = num;
				    menor = num;
		    	
		    	
		    }    
		    if(num > maior)
		    	maior = num;{
		    }
		    if(num < menor && num > 0) {
		    	menor = num;
		    }
		   
		    }while(num != 0);
		    System.out.println("Numero menor " + menor);
		    System.out.println("Numero maior " + maior);
		 }
	}

		
	


