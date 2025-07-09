import java.util.Scanner;
public class bee1010 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int codigoDaPeca1, codigoDaPeca2, numeroDePecas1, numeroDePecas2;
	double valorDaPeca1, valorDaPeca2, valorAPagar;
	
	codigoDaPeca1 = sc.nextInt();
	numeroDePecas1 = sc.nextInt();
	valorDaPeca1 = sc.nextDouble();
	
	codigoDaPeca2 = sc.nextInt();
	numeroDePecas2 = sc.nextInt();
	valorDaPeca2 = sc.nextDouble();
	
	valorAPagar = (numeroDePecas1 * valorDaPeca1) + (numeroDePecas2 * valorDaPeca2); 
	
	System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorAPagar);
	
	sc.close();
	}
	
}
