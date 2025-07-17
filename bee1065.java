import java.util.Scanner;

public class bee1065 {

	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int num5 = sc.nextInt();
		int pares = 0;
		
		if (num1 % 2 == 0)
		{
			pares+=1;
		}
		if (num2 % 2 == 0)
		{
			pares+=1;
		}
		if (num3 % 2 == 0)
		{
			pares+=1;
		}
		if (num4 % 2 == 0)
		{
			pares+=1;
		}
		if (num5 % 2 == 0)
		{
			pares+=1;
		}
		
		System.out.printf("%d valores pares%n", pares);
		
		sc.close();
	}
}
