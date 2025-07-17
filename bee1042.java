import java.util.Scanner;

public class bee1042 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	 
		int maior, menor;
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		if (n1>n2 && n1>n3)
		{
			maior = n1;
			if(n2 > n3)
			{
				menor = n3;
				System.out.printf("%d%n%d%n%d%n",menor, n2, maior);
			}
			else
			{
				menor = n2;
				System.out.printf("%d%n%d%n%d%n",menor, n3, maior);
			}
		}
		
		if(n2>n1 && n2>n3)
		{
			maior = n2;
			if(n1 > n3)
			{
				menor = n3;
				System.out.printf("%d%n%d%n%d%n",menor, n1, maior);
			}
			else
			{
				menor = n1;
				System.out.printf("%d%n%d%n%d%n",menor, n3, maior);
			}
		}
		
		if(n3>n1 && n3>n2)
		{
			maior = n3;
			if(n2 > n1)
			{
				menor = n1;
				System.out.printf("%d%n%d%n%d%n",menor, n2, maior);
			}
			else
			{
				menor = n2;
				System.out.printf("%d%n%d%n%d%n",menor, n1, maior);
			}
		}
		
		System.out.println();
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
		sc.close();
	}
}
