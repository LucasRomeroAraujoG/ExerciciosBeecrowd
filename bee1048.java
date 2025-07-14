import java.util.Scanner;

public class bee1048 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	 
		double salario = sc.nextDouble();
		double reajuste, aumento;
		
		if (salario <= 400.00)
		{
			reajuste = salario * 0.15;
			aumento = salario + reajuste;
			System.out.printf("Novo salario: %.2f%n", aumento);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 15 %");
		}
		
		else if (salario <= 800.00)
		{
			reajuste = salario * 0.12;
			aumento = salario + reajuste;
			System.out.printf("Novo salario: %.2f%n", aumento);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 12 %");
		}
		
		else if (salario <= 1200.00)
		{
			reajuste = salario * 0.10;
			aumento = salario + reajuste;
			System.out.printf("Novo salario: %.2f%n", aumento);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 10 %");
		}
		
		else if (salario <= 2000.00)
		{
			reajuste = salario * 0.07;
			aumento = salario + reajuste;
			System.out.printf("Novo salario: %.2f%n", aumento);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 7 %");
		}
		
		else {
				reajuste = salario * 0.04;
				aumento = salario + reajuste;
				System.out.printf("Novo salario: %.2f%n", aumento);
				System.out.printf("Reajuste ganho: %.2f%n", reajuste);
				System.out.println("Em percentual: 4 %");
			}
		
		sc.close();
	}
}
	
