import java.util.Scanner;

public class bee1019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int horas, minutos, segundos, valorInteiro;
		
		valorInteiro = sc.nextInt();
		
		segundos = valorInteiro % 60;
		minutos = valorInteiro / 60 % 60;
		horas = valorInteiro / 3600 % 3600;
		
		System.out.printf("%d:%d:%d%n", horas, minutos, segundos);
		
		sc.close();
	}

}
