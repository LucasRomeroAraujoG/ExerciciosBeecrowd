import java.util.Scanner;


public class java1153 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n  = sc.nextInt();
	
	int fatorial = n;
	
	for(int i=n-1;i>=1;i--)
	{
		fatorial *= i;
	}
	
	System.out.println(fatorial);
	
	sc.close();
	}
	
}
