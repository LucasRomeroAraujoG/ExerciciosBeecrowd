import java.util.Scanner;

public class bee1158 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		while (n > 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int soma = 0;

			for (int i = 0; i < y; i++) {
				if (x % 2 == 0) {
					x++;
				}
				if (x % 2 != 0) {
					soma += x;
					x++;
				}
			}

			System.out.println(soma);
			n--;
		}

		sc.close();
	}
}
