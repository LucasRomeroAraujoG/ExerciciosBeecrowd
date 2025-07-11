import java.util.Scanner;

public class bee1020 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int idadeEmDias, resto, ano, mes, dia;
	idadeEmDias = sc.nextInt();
	
	ano = idadeEmDias / 365;
	resto = idadeEmDias % 365;
	
	mes = resto / 30;
	dia = resto % 30;
	
	System.out.println(ano + " ano(s)");
	System.out.println(mes + " mes(es)");
	System.out.println(dia + " dia(s)");

	sc.close();
	}

}
