import java.util.Scanner;

public class bee1078 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int resultado = 0;
		
		
		for(int i=1; i<=10; i++)
		{
			resultado = N * i;
			System.out.printf("%d x %d = %d%n", i, N, resultado);
		}

		sc.close();
	}
}
