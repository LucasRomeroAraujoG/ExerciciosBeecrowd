import java.util.Scanner;

public class bee1036 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);

	double A, B, C, delta, raizQuadrada1, raizQuadrada2;
	A = sc.nextDouble();
	B = sc.nextDouble();
	C = sc.nextDouble();
	
	delta = Math.pow(B, 2) - 4.0 * A * C;
	raizQuadrada1 = (-B + Math.sqrt(delta)) / (2.0 * A);
	raizQuadrada2 = (-B - Math.sqrt(delta)) / (2.0 * A);
	
	if (A == 0 || delta < 0.0) {
		System.out.println("Impossivel calcular");
	}
	else {
		System.out.printf("R1 = %.5f%n", raizQuadrada1);
		System.out.printf("R2 = %.5f%n", raizQuadrada2);
	}
	
	sc.close();
	}

}
