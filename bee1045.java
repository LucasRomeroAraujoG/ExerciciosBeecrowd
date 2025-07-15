import java.util.Scanner;

//Codigo redundante, poderia ter sido melhor. Irei refazer no futuro.
public class bee1045 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	double A = sc.nextDouble();
	double B = sc.nextDouble();
	double C = sc.nextDouble();
	
	
	if (A >= B && A >= C)
	{
		//Maior A
		if (A >= B + C)
		{
		System.out.println("NAO FORMA TRIANGULO");	
		}
		else if (A * A > B * B + C * C)
		{
			System.out.println("TRIANGULO OBTUSANGULO");
		}
		if (A * A == B * B + C * C)
		{
			System.out.println("TRIANGULO RETANGULO");
		}
		if (A * A < B * B + C * C)
		{
			System.out.println("TRIANGULO ACUTANGULO");
		}
		if (A == B && A == C)
		{
			System.out.println("TRIANGULO EQUILATERO");
		}
		if(A == B && A != C || B == C && B != A || C == A && C != B)
		{
			System.out.println("TRIANGULO ISOSCELES");
		}
		
	}
	
	else if (B >= A && B >= C)
	{
		//Maior B
		if (B >= A + C)
		{
		System.out.println("NAO FORMA TRIANGULO");	
		}
		else if (B * B > A * A + C * C)
		{
			System.out.println("TRIANGULO OBTUSANGULO");
		}
		if (B * B == A * A + C * C)
		{
			System.out.println("TRIANGULO RETANGULO");
		}
		if (B * B < A * A + C * C)
		{
			System.out.println("TRIANGULO ACUTANGULO");
		}
		if (A == B && A == C)
		{
			System.out.println("TRIANGULO EQUILATERO");
		}
		if(A == B && A != C || B == C && B != A || C == A && C != B)
		{
			System.out.println("TRIANGULO ISOSCELES");
		}
		
	}
	
	else if (C >= B && C >= A)
	{
		//Maior C
		if (C >= B + A)
		{
		System.out.println("NAO FORMA TRIANGULO");	
		}
		else if (C * C > B * B + A * A)
		{
			System.out.println("TRIANGULO OBTUSANGULO");
		}
		if (C * C == B * B + A * A)
		{
			System.out.println("TRIANGULO RETANGULO");
		}
		if (C * C < B * B + A * A)
		{
			System.out.println("TRIANGULO ACUTANGULO");
		}
		if (A == B && A == C)
		{
			System.out.println("TRIANGULO EQUILATERO");
		}
		if(A == B && A != C || B == C && B != A || C == A && C != B)
		{
			System.out.println("TRIANGULO ISOSCELES");
		}
		
	}
	
	
	sc.close();
	}
	
}
