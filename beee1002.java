import java.util.Scanner;
public class beee1002 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double area, raio, pi;
		pi = 3.14159;
		
		raio = sc.nextDouble();
		
		area = Math.pow(raio, 2) * pi;
		
		System.out.printf("A=%.4f%n", area);
		
		sc.close();
	}
}
	
