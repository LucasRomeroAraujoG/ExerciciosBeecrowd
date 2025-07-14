import java.util.Scanner;

public class bee1040 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	 
		float n1 = sc.nextFloat();
		float n2 = sc.nextFloat();
		float n3 = sc.nextFloat();
		float n4 = sc.nextFloat();
		
		float media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10f;
		
		if (media >= 7.0)
		{
			System.out.printf("Media: %.1f%n", media);
			System.out.println("Aluno aprovado.");
		}
		else if(media < 5.0)
		{
			System.out.printf("Media: %.1f%n", media);
			System.out.println("Aluno reprovado.");
		}
		else if(media >= 5.0 && media <= 6.9){
			System.out.printf("Media: %.1f%n", media);
			System.out.println("Aluno em exame.");
			float notaExame = sc.nextFloat();
			System.out.println("Nota do exame: " + notaExame);
			media = (notaExame + media) / 2f;
			if(media >= 5.0) {
				System.out.println("Aluno aprovado.");
				System.out.printf("Media final: %.1f%n", media);
			}
			else
			{
				System.out.println("Aluno reprovado.");
				System.out.printf("Media final: %.1f%n", media);
			}
		}
		
		sc.close();
	}
}
