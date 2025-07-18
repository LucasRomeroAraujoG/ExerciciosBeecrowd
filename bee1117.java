import java.util.Scanner;

public class bee1117 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double notaValida = sc.nextDouble();
		double qntAvaliacoes = 0.0;
		double media = 0.0;
		
		if(notaValida < 0.0 || notaValida > 10.0)
		{
			System.out.println("nota invalida");
			notaValida = sc.nextDouble();
		}
		
		
		while (qntAvaliacoes != 2.0)
		{
			if(notaValida > 0.0 && notaValida <= 10.0)
			{
				media += notaValida;
				qntAvaliacoes += 1.0;
				if(qntAvaliacoes != 2.0)
					{
					notaValida = sc.nextDouble();
					}
			}
			
			if(notaValida < 0.0 || notaValida > 10.0)
			{
				System.out.println("nota invalida");
				notaValida = sc.nextDouble();
			}
			
			
		}
		
		media = media / 2.0;
		System.out.printf("media = %.2f%n", media);
		
		
		sc.close();
	}
}
