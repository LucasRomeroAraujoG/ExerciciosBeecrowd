import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int d1, h1, m1, s1, d2, h2, m2, s2, inicio, fim, duracao, resto;
	int dd, hh, mm, ss;
	String s;
	
	//Primeira entrada
	s = sc.next();
	d1 = sc.nextInt();
	h1 = sc.nextInt();
	s = sc.next();
	m1 = sc.nextInt();
	s = sc.next();
	s1 = sc.nextInt();
	
	//Segunda entrada
	s = sc.next();
	d2 = sc.nextInt();
	h2 = sc.nextInt();
	s = sc.next();
	m2 = sc.nextInt();
	s = sc.next();
	s2 = sc.nextInt();
	
	//Duração do evento em segundos
	inicio = d1 * 24 * 60 * 60 + h1 * 60 * 60 + m1 * 60 + s1;
	fim = d2 * 24 * 60 * 60 + h2 * 60 * 60 + m2 * 60 + s2;
	duracao = inicio - fim;
	
	//Calculo do tempo de evento, utilizando como base o valor acima
	//Em um dia, existem 86400 segundos. Em uma hora, 3600. E em um minuto, 60.
	
	dd = Math.abs(duracao / 86400);
	resto = duracao % 86400;
	System.out.println(dd + " dia(s)");
	
	hh = Math.abs(resto / 3600);
	resto = resto % 3600;
	System.out.println(hh + " hora(s)");
	
	mm = Math.abs(resto / 60);
	resto = resto % 60;
	System.out.println(mm + " minuto(s)");
	
	ss = Math.abs(resto);
	System.out.println(ss + " segundo(s)");
	
	sc.close();
	}

}
