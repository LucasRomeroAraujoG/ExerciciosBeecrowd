import java.util.Scanner;
public class bee1014 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int X;
		double Y, consumoMedio;
		
		X = sc.nextInt();
		Y = sc.nextDouble();
		consumoMedio = X / Y;
		
		System.out.printf("%.3f km/l%n", consumoMedio);
		
		sc.close();
	}
	
}
