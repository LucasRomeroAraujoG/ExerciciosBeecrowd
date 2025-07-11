import java.util.Scanner;

public class bee1021.java {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	double valorMonetario, quociente, resto, notas, moedas;
	valorMonetario = sc.nextDouble();
	
	System.out.println("NOTAS:");
	
	notas = 100;
	quociente = valorMonetario / notas;
	resto = valorMonetario % notas;
	System.out.println((int)quociente + " nota(s) de R$ 100.00");
	
	notas = 50;
	quociente = resto / notas;
	resto = resto % notas;
	System.out.println((int) quociente + " nota(s) de R$ 50.00");
	
	notas = 20;
	quociente = resto / notas;
	resto = resto % notas;
	System.out.println((int)quociente + " nota(s) de R$ 20.00");
	
	notas = 10;
	quociente = resto / notas;
	resto = resto % notas;
	System.out.println((int)quociente + " nota(s) de R$ 10.00");
	
	notas = 5;
	quociente = resto / notas;
	resto = resto % notas;
	System.out.println((int)quociente + " nota(s) de R$ 5.00");
	
	notas = 2;
	quociente = resto / notas;
	resto = resto % notas;
	System.out.println((int)quociente + " nota(s) de R$ 2.00");
	
	/****************/
	
	System.out.println("MOEDAS:");
	
	resto = resto * 100 + 0.5;
	
	moedas = 100;
	quociente = resto / moedas;
	resto = resto % moedas;
	System.out.println((int)quociente + " moeda(s) de R$ 1.00");
	
	moedas = 50;
	quociente = resto / moedas;
	resto = resto % moedas;
	System.out.println((int)quociente + " moeda(s) de R$ 0.50");
	
	moedas = 25;
	quociente = resto / moedas;
	resto = resto % moedas;
	System.out.println((int)quociente + " moeda(s) de R$ 0.25");
	
	moedas = 10;
	quociente = resto / moedas;
	resto = resto % moedas;
	System.out.println((int)quociente + " moeda(s) de R$ 0.10");
	
	moedas = 5;
	quociente = resto / moedas;
	resto = resto % moedas;
	System.out.println((int)quociente + " moeda(s) de R$ 0.05");
	
	moedas = 1;
	quociente = resto / moedas;
	System.out.println((int)quociente + " moeda(s) de R$ 0.01");	
	
	sc.close();
	
	}

}
