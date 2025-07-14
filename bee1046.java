import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	 
		int horaInicial = sc.nextInt();
		int horaFim = sc.nextInt();
		int horaDoJogo;
		
		if(horaInicial < horaFim)
		{
			horaDoJogo = horaFim - horaInicial; 
			System.out.println("O JOGO DUROU " + horaDoJogo + " HORA(S)");
		}
		else
		{
			horaDoJogo = 24 - horaInicial + horaFim;
			System.out.println("O JOGO DUROU " + horaDoJogo + " HORA(S)");
		}
		
		sc.close();
	}
}
