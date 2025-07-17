import java.util.Scanner;

public class bee1064 {

	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double num3 = sc.nextDouble();
		double num4 = sc.nextDouble();
		double num5 = sc.nextDouble();
		double num6 = sc.nextDouble();
		double valoresPositivos = 0.0;
		double media = 0.0;
		
		
		if(num1 > 0)
		{
			valoresPositivos += 1;
			media += num1;
		}
		if(num2 > 0)
		{
			valoresPositivos += 1;
			media += num2;
		}
		if(num3 > 0)
		{
			valoresPositivos += 1;
			media += num3;
		}
		if(num4 > 0)
		{
			valoresPositivos += 1;
			media += num4;
		}
		if(num5 > 0)
		{
			valoresPositivos += 1;
			media += num5;
		}
		if(num6 > 0)
		{
			valoresPositivos += 1;
			media += num6;
		}
		
		media /= valoresPositivos;
		System.out.printf("%.0f valores positivos%n", valoresPositivos);
		System.out.printf("%.1f%n", media);
		
		sc.close();
	}
}
	
