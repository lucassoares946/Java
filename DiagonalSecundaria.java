package Lista3Mauricio;

import java.util.Scanner;

public class DiagonalSecundaria {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		//Leitura e impressão de uma matriz MAT de 5x5
		int MAT[][] = new int[5][5];
		int i, j; //i = linhas e j = colunas
		System.out.println("Leitura de uma matriz MAT de 5x5:");
		for(i = 0;i < 5;i++) {
		for(j = 0;j < 5;j++) {
		System.out.println("Digite MAT[" + i + "][" + j + "]:");
		MAT[i][j] = ent.nextInt();
		}
		}
		System.out.printf("\n\nImpressão da Matriz de 5x5: \n\n");
		for(i = 0;i < 5;i++) {
		for(j = 0;j < 5;j++) {
		System.out.printf("%d\t",MAT[i][j]);
		}
		System.out.printf("\n");
		}
		System.out.println("Diagonal Principal da Matriz: ");
		for(i = 0;i < 5;i++) {
		for(j = 0;j < 5;j++) {
		if(i==j) {System.out.printf("%d",MAT[i][j]);}
		else {System.out.printf("\t");}
		}
		System.out.printf("\n");
		}
		System.out.printf("\n\nMatriz sem a Diagonal Principal: \n\n");
		for(i = 0;i < 5;i++) {
		for(j = 0;j < 5;j++) {
		if(i!=j) {System.out.printf("%d\t",MAT[i][j]);}
		else {System.out.printf("\t");}
		}
		System.out.printf("\n");
		}
		System.out.printf("\n\nMatriz Triangular Superior: \n\n");
		for(i = 0;i < 5;i++) {
		for(j = 0;j < 5;j++) {
		if(i < j) {System.out.printf("%d\t",MAT[i][j]);}
		else {System.out.printf("\t");}
		}
		System.out.printf("\n");
		}
		System.out.printf("\n\nMatriz Triangular Inferior: \n\n");
		for(i = 0;i < 5;i++) {
		for(j = 0;j < 5;j++) {
		if(i > j) {System.out.printf("%d\t",MAT[i][j]);}
		else {System.out.printf("\t");}
		}
		System.out.printf("\n");
		}
		System.out.printf("\n\nDiagonal Secundária: \n\n");
		for(i = 0;i < 5;i++) {
		for(j = 0;j < 5;j++) {
		if(i + j == 4) {System.out.printf("%d\t",MAT[i][j]);}
		else {System.out.printf("\t");}
		}
		System.out.printf("\n");
		}
		}
		}