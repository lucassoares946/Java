package Lista3Mauricio;

public class Xadrez {

	public static void main(String[] args) {
	int i = 1;
	int j = 1;
	int t = 1; 
	int c = 1;
	int b = 1;
	int r = 1; 
	int R = 1;
	int p = 1;
	do {
		do {
			if((i+j)%2==0){
				System.out.print("P "); j++;
			}else {
				System.out.print("B "); j++;
			}
		}while (j <= 8);
		System.out.println("");
		j = 1;
		i++;
	}while(i <=8);
	}
}
				
			
