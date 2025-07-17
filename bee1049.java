import java.util.Scanner;

public class bee1049 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	 
		String palavra1 = sc.next();
		String palavra2 = sc.next();
		String palavra3 = sc.next();
		
		
		
		if(palavra1.equals("vertebrado") && palavra2.equals("ave"))
		{
			if(palavra3.equals("carnivoro"))
			{
				System.out.println("aguia");
			}
			else
			{
				System.out.println("pomba");
			}
		}
		else if (palavra1.equals("vertebrado") && palavra2.equals("mamifero"))
		{
			if (palavra3.equals("onivoro")) 
			{
				System.out.println("homem");
			}
			else {
				System.out.println("vaca");
			}
		}
		
		else if(palavra1.equals("invertebrado") && palavra2.equals("inseto"))
		{
			if (palavra3.equals("hematofago")) 
			{
				System.out.println("pulga");
			}
			else {
				System.out.println("lagarta");
			}
		}
		else
		{
			if (palavra3.equals("hematofago")) 
			{
				System.out.println("sanguessuga");
			}
			else {
				System.out.println("minhoca");
			}
		}
		
		sc.close();
	}
}
