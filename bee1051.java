import java.util.Scanner;

public class bee1051 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	 
		double salario = sc.nextDouble();
		double valorImposto;
		
		if(salario <= 2000.00)
		{
			System.out.println("Isento");
		}
		else if(salario > 2000.00 && salario <= 3000.00)
		{
			salario -= 2000.00;
			valorImposto = salario * 0.08;
			System.out.printf("R$ %.2f%n", valorImposto);
		}
		else if(salario > 3000.00 && salario <= 4500.00)
		{
			salario-= 2000.00;
			valorImposto = (1000 * 0.08) + ((salario - 1000) * 0.18);
			System.out.printf("R$ %.2f%n", valorImposto);
		}
		else
		{
			salario-=2000.00;
			valorImposto = (1000 * 0.08) + (1500 * 0.18) + ((salario - 2500) * 0.28); 
			System.out.printf("R$ %.2f%n", valorImposto);
		}
		
		sc.close();
	}
}
	
