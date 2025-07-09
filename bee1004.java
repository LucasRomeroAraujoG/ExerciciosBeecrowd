import java.util.Scanner;
public class bee1004 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int number1,number2,PROD;
	
	number1 = sc.nextInt();
	number2 = sc.nextInt();
	
	PROD = number1 * number2;
	
	System.out.println("PROD = " + PROD);

  sc.close();
	}
	
}
