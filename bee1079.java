import java.util.Scanner;


public class bee1079 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	
	for(int i=0;i<n;i++)
	{
		double nota = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double nota3 = sc.nextDouble();
		
		double media = (nota * 2.0 + nota2 * 3.0 + nota3 * 5.0) / 10.0;
		
		System.out.printf("%.1f%n", media);
	}
	
	sc.close();
	}
	
}
