import java.util.Scanner;

public class bee1159 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma = 0;
		
		while(x != 0)
		{
			if(x % 2 == 0) {
				soma = x;
				x += 2;
				soma += x;
				x += 2;
				soma += x;
				x += 2;
				soma += x;
				x += 2;
				soma += x;
				
				System.out.println(soma);
				x = sc.nextInt();
			}
			else {
				//Acrescento 1 pois o numero é impar, assim, facilitando o calculo dos proximos 5 pares. 
				
				x += 1;
				soma = x;
				x += 2;
				soma += x;
				x += 2;
				soma += x;
				x += 2;
				soma += x;
				x += 2;
				soma += x;
				
				System.out.println(soma);
				
				x = sc.nextInt();
			}
		}
		
		sc.close();
	}
}
	
