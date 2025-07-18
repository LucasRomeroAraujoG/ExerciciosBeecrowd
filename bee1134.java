import java.util.Scanner;

public class bee1134 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int produtos = sc.nextInt();
		int gasolina = 0;
		int diesel = 0;
		int alcool = 0;
		
		while(produtos != 4)
		{
			if(produtos == 1)
			{
				alcool += 1;
			}
			else if(produtos == 2)
			{
				gasolina += 1;
			}
			else if(produtos == 3)
			{
				diesel += 1;
			}

			produtos = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d%n", alcool);
		System.out.printf("Gasolina: %d%n", gasolina);
		System.out.printf("Diesel: %d%n", diesel);
		
		
		sc.close();
	}
}
