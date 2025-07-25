import java.util.Scanner;

public class bee1146 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		
		for(int i=1;x!=0;i++)
		{
			if(i<x)
			{
			System.out.print(i + " ");
			}
			if(i==x)
			{
				System.out.printf(i +"%n");
				i = 0;
				x = sc.nextInt();
			}
			
		}

		sc.close();
	}

}
