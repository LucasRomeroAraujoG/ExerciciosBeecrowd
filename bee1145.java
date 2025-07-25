import java.util.Scanner;

public class bee1145 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		int cont = 1;
		for (int i = 1; i <= y; i++) {
			if (cont == x) {
				System.out.printf("%d%n", i);
				cont = 1;
			} else {
				System.out.print(i + " ");
				cont += 1;
			}
		}

		sc.close();
	}

}
