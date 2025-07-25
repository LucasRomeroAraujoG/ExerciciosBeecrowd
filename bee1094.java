import java.util.Scanner;

public class bee1094 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	
	int nCobaias = 0;
	int coelhos = 0, ratos = 0, sapos = 0;
	int soma = 0;
	double pCoelhos, pRatos, pSapos;
	for (int i=0;i<n;i++)
	{
		nCobaias = sc.nextInt();
		char tipoCobaia = sc.next().charAt(0);
		
		soma += nCobaias;
		
		if(tipoCobaia == 'C')
		{
			coelhos += nCobaias;		
		}
		else if(tipoCobaia == 'R')
		{
			ratos += nCobaias;
		}
		else {
			sapos += nCobaias;
		}
	}
	
	pCoelhos = (double) coelhos / soma * 100;
	pRatos = (double) ratos / soma * 100;
	pSapos = (double) sapos / soma * 100;
	
	System.out.printf("Total: %d cobaias%n", soma);
	System.out.printf("Total de coelhos: %d%n", coelhos);
	System.out.printf("Total de ratos: %d%n", ratos);
	System.out.printf("Total de sapos: %d%n", sapos);
	System.out.printf("Percentual de coelhos: %.2f %%%n", pCoelhos);
	System.out.printf("Percentual de ratos: %.2f %%%n", pRatos);
	System.out.printf("Percentual de sapos: %.2f %%%n", pSapos);
	
	sc.close();
	}
	
}
