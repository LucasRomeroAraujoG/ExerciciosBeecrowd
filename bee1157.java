import java.util.Scanner;


public class bee1157 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	
	for(int i=1;i<=n;i++)	
	{
		if(n%i == 0)
		{
			System.out.println(i);
		}
	}
	
	sc.close();
	}
	
}

