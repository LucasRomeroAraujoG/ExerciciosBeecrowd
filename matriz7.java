import java.util.Scanner;

public class matriz7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] soldados = new int[m][n];
		
		for(int i = 0;i<m;i++) {
			for(int j = 0;j<n;j++) {
				soldados[i][j] = sc.nextInt();
			}
		}
		
		//Girar fila
		int girarFila = sc.nextInt();
		int soldadoDireita = soldados[girarFila-1][n-1];
		
		
		for(int i=n-1;i>0;i--) {
			soldados[girarFila-1][i] = soldados[girarFila-1][i-1];
		}
		
		
		soldados[girarFila-1][0] = soldadoDireita;
			
		//Imprimir a matriz após o exercício do girar fila 
			for(int i = 0;i<m;i++)
			{
				for(int j = 0;j<n;j++)
				{
					System.out.print(soldados[i][j] + " ");
				}
				System.out.println();
			}
		
		
		sc.close();
	}

}
