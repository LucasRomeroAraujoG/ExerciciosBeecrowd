import java.util.Scanner;

public class bee1143 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		
		int inicio = 1;
		int segundo = 0;
		int terceiro = 0;
		
		for(int i=0;i<n;i++)
		{
			segundo = inicio * inicio;
			terceiro = inicio * segundo;
			System.out.printf("%d %d %d%n", inicio, segundo, terceiro);
			
			inicio += 1;
		}
		
		sc.close();
	}

}
