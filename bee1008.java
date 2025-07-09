import java.util.Scanner;
public class bee1008 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int numeroDoFuncionario, horasTrabalhadas;
	double valorPorHora,salarioDoFuncionario;
	
	numeroDoFuncionario = sc.nextInt();
	horasTrabalhadas = sc.nextInt();
	valorPorHora = sc.nextDouble();
	
	salarioDoFuncionario = (double) valorPorHora * horasTrabalhadas;
	
	System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", numeroDoFuncionario, salarioDoFuncionario);	
	
	sc.close();
	}
	
}
