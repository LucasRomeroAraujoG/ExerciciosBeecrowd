import java.util.Scanner;

public class bee1070 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		
		if(num1 % 2 != 0)
		{
			System.out.println(num1);
			num1 += 2;
			System.out.println(num1);
			num1 += 2;
			System.out.println(num1);
			num1 += 2;
			System.out.println(num1);
			num1 += 2;
			System.out.println(num1);
			num1 += 2;
			System.out.println(num1);
		}
		
		else if(num1 % 2 == 0)
		{
			num1 +=1;
			System.out.println(num1);
			num1 += 2;
			System.out.println(num1);
			num1 += 2;
			System.out.println(num1);
			num1 += 2;
			System.out.println(num1);
			num1 += 2;
			System.out.println(num1);
			num1 += 2;
			System.out.println(num1);
		}
		
		
		sc.close();
	}
}
