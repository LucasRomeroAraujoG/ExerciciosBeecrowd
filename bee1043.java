import java.util.Scanner;

public class bee1043 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	 
		float A = sc.nextFloat();
		float B = sc.nextFloat();
		float C = sc.nextFloat();
		float perimetro = A + B + C;
		float area = ((A + B) * C) / 2;
		
		
		if(A + B > C && A + C > B && B + C > A)
		{
			System.out.printf("Perimetro = %.1f%n", perimetro);
		}
		else
		{
			System.out.printf("Area = %.1f%n", area);
		}
		
		
		sc.close();
	}
}
