import java.util.Scanner;

public class bee1009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double salariofixo, totalDeVendas, totalSalario;
		
		nome = sc.next();
		salariofixo = sc.nextDouble();
		totalDeVendas = sc.nextDouble();
		
		totalSalario = (double) (15 * totalDeVendas / 100) + salariofixo;
		
		System.out.printf("TOTAL = R$ %.2f%n", totalSalario);
		
		sc.close();
	}

}
