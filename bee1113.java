import java.util.Scanner;

public class bee1113 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		//Código melhorado e mais limpo após verificar a aula de resolução do Professor Nélio!
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		while(num1 != num2)
		{
			if(num1 > num2)
			{
				System.out.println("Decrescente");
			}
			else {
				System.out.println("Crescente");
			}
			num1 = sc.nextInt();
			num2 = sc.nextInt();
		}
		
		sc.close();
	}
}
	
