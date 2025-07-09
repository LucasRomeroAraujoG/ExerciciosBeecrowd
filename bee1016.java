import java.util.Scanner;
public class bee1016 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int distancia = sc.nextInt();
		
		int tempoNecessario;
		
		tempoNecessario = distancia * 2;
		
		System.out.println(tempoNecessario + " minutos");
		
		sc.close();
	}
	
}
