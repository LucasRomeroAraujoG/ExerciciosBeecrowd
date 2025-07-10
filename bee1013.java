import java.util.Scanner;

public class bee1013 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, maiorNumeroAB, maiorNumeroABC;
	
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		maiorNumeroAB = ((a + b + Math.abs(a-b)) / 2);
		maiorNumeroABC = ((maiorNumeroAB + c + Math.abs(maiorNumeroAB-c)) / 2);
		
		System.out.println(maiorNumeroABC + " eh o maior");
		
		sc.close();
	}

}
