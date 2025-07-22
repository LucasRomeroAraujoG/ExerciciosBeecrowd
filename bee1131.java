import java.util.Scanner;

public class bee1131 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int novoGrenal = 1;
		
		int qtdGrenais = 0, golsInter = 0, golsGremio = 0, empates = 0, inter = 0, gremio = 0;
		
		while (novoGrenal == 1)
		{
			qtdGrenais += 1;
			golsInter = sc.nextInt();
			golsGremio = sc.nextInt();
			
			if(golsInter > golsGremio)
			{
				inter += 1;
			}
			if(golsGremio > golsInter)
			{
				gremio += 1;
			}
			else if(golsGremio == golsInter)
			{
				empates += 1;
			}
			
		
			System.out.println("Novo grenal (1-sim 2-nao)");
			novoGrenal = sc.nextInt();
		}		
		
		System.out.println(qtdGrenais + " grenais");
		System.out.println("Inter:" + inter);
		System.out.println("Gremio:" + gremio);
		System.out.println("Empates:" + empates);
		
		
		if (inter > gremio)
		{
			System.out.println("Inter venceu mais");
		}
		else if(gremio > inter)
		{
			System.out.println("Gremio venceu mais");
		}
		else {
			System.out.println("Nao houve vencedor");
		}

		sc.close();
	}
}
