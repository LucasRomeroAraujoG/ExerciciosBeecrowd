import java.util.Scanner;

public class bee1047 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	 
		int horaInicial, minutoInicial, horaFinal, minutoFinal, hm1, hm2, h24, resultado;
		
		horaInicial = sc.nextInt();
		minutoInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		minutoFinal = sc.nextInt();

    //Converter tudo em minutos
		hm1 = horaInicial * 60 + minutoInicial;
		hm2 = horaFinal * 60 + minutoFinal;
		h24 = 24 * 60;
		
		if(hm1 > hm2)
		{
			resultado = hm2 + (h24 - hm1);
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", resultado / 60, resultado % 60);
		}
			
		else if(hm2 > hm1)
		{
			resultado = hm2 - hm1;
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", resultado / 60, resultado % 60);
		}
		else
		{
			resultado = h24;
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", resultado / 60, resultado % 60);
		}
		
		
		sc.close();
	}
}
