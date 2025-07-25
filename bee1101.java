import java.util.Scanner;

public class bee1101 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();

		while (M > 0 && N > 0) {
			int soma = 0;
			int menor = M;
			int maior = N;
			if (M > N) {
				menor = N;
				maior = M;
			}

			for (int i = menor; i <= maior; i++) {
				System.out.printf("%d ", i);
				soma = soma + i;
			}
			
			System.out.println("Sum=" + soma);
			M = sc.nextInt();
			N = sc.nextInt();
		}

		sc.close();
	}

}
