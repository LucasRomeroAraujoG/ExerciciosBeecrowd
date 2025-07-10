import java.util.Scanner;

public class bee1018 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int numeroInteiro, quociente, resto, cedula;
	numeroInteiro = sc.nextInt();
	System.out.println(numeroInteiro);
	
	resto = numeroInteiro;
	
	cedula = 100;
	quociente = resto / cedula;
	System.out.println(quociente + " nota(s) de R$ 100,00");
	resto = resto % cedula;
	
	
	cedula = 50;
	quociente = resto / cedula;
	System.out.println(quociente + " nota(s) de R$ 50,00");
	resto = resto % cedula;
	
	cedula = 20;
	quociente = resto / cedula;
	System.out.println(quociente + " nota(s) de R$ 20,00");
	resto = resto % cedula;
	
	cedula = 10;
	quociente = resto / cedula;
	System.out.println(quociente + " nota(s) de R$ 10,00");
	resto = resto % cedula;
	
	cedula = 5;
	quociente = resto / cedula;
	System.out.println(quociente + " nota(s) de R$ 5,00");
	resto = resto % cedula;
	
	cedula = 2;
	quociente = resto / cedula;
	System.out.println(quociente + " nota(s) de R$ 2,00");
	resto = resto % cedula;
	
	cedula = 1;
	quociente = resto / cedula;
	System.out.println(quociente + " nota(s) de R$ 1,00");
	resto = resto % cedula;

	sc.close();
	}

}
