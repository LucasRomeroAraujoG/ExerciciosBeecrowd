import java.util.Scanner;

public class bee1142 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int cont = 0;
		int multi = n * 4;
		
		
		for (int i = 1; i <= multi; i++) {
			
			if (cont >= 3) {
				System.out.println("PUM");
				cont = 0;
			} else {
				System.out.print(i + " ");
				cont += 1;
			}
		}
		sc.close();
	}

}
