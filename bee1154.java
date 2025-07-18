import java.util.Scanner;
//poderia ter usado casting, nao lembrei no raciocinio
public class bee1154 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade = sc.nextInt();
		int cont = 0;
		double mediaIdade = 0.0;
		
		while (idade > 0)
		{
			cont+=1;
			mediaIdade += idade;
			idade = sc.nextInt();
		}
		
		mediaIdade /= cont;
		
		System.out.printf("%.2f%n", mediaIdade);
		
		sc.close();
	}
}
