import java.util.Scanner;

public class bee1015 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x2, x1, y2, y1, valorDaDistancia;
		
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		
		valorDaDistancia = Math.sqrt(Math.pow(x2 - x1, 2.0) + Math.pow(y2 - y1, 2.0));
		
		System.out.printf("%.4f%n", valorDaDistancia);
		
		sc.close();
	}

}
