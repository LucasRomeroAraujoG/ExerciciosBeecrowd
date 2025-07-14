import java.util.Scanner;

public class bee1037 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	 
		double valorEntrada = sc.nextDouble();
		
		if(valorEntrada >=0 && valorEntrada <= 25.00)
		{
			System.out.println("Intervalo [0,25]");
		}
		
		else if (valorEntrada >= 25.01 && valorEntrada <= 50.00)
		{
			System.out.println("Intervalo (25,50]");
		}
		else if (valorEntrada >= 50.01 && valorEntrada <= 75.00)
		{
			System.out.println("Intervalo (50,75]");
		}
		else if (valorEntrada >= 75.01 && valorEntrada <= 100.00)
		{
			System.out.println("Intervalo (75,100]");
		}
		else
		{
			System.out.println("Fora de intervalo");
		}
		sc.close();
	}
}
