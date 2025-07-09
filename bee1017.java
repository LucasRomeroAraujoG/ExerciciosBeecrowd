import java.util.Scanner;
public class bee1017 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int horasDeViagem, velocidadeMedia;
		double quantidadeNecessariaDeLitros;
		
		horasDeViagem = sc.nextInt();
		velocidadeMedia = sc.nextInt();
		
		quantidadeNecessariaDeLitros = (double) horasDeViagem * velocidadeMedia / 12.0;
		
		System.out.printf("%.3f%n", quantidadeNecessariaDeLitros);
		
		sc.close();
	}
	
}
