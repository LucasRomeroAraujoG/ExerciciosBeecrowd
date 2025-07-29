import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        String nomes[] = new String[n];
        double pSemestre[] = new double[n];
        double sSemestre[] = new double[n];
        
        for(int i = 0;i<n;i++)
        {
            nomes[i] = sc.next();
            pSemestre[i] = sc.nextDouble();
            sSemestre[i] = sc.nextDouble();
        }
        
        double media[] = new double[n];
        for(int i = 0;i<n;i++)
        {
            media[i] = (pSemestre[i] + sSemestre[i]) / 2.0;
        }
        
        int cont = 0;
        System.out.println("Alunos aprovados: ");
        for (double m : media)
        {
            if(m >= 6.0)
            {
                System.out.println(nomes[cont]); 
            }
            cont++;
        }
        
        sc.close();
    }
}
