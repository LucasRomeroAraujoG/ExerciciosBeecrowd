import java.util.Scanner;

public class bee1118 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double novoCalculo = 1;
		
		while(novoCalculo == 1)
		{
			double primeiraNota = sc.nextDouble();
			while(primeiraNota<0.0 || primeiraNota >= 11.0)
			{
				System.out.println("nota invalida");
				primeiraNota = sc.nextDouble();
			}
			
			double segundaNota = sc.nextDouble();
			while(segundaNota<0.0 || segundaNota >= 11.0)
			{
				System.out.println("nota invalida");
				segundaNota = sc.nextDouble();
			}
			
			double media = (primeiraNota + segundaNota) / 2;
			System.out.printf("media = %.2f%n", media);
			
			System.out.println("novo calculo (1-sim 2-nao)");
			novoCalculo = sc.nextDouble();
			while(novoCalculo != 1 && novoCalculo != 2)
			{
				System.out.println("novo calculo (1-sim 2-nao)");
				novoCalculo = sc.nextDouble();
			}
			
		}		
		sc.close();
	}
}
