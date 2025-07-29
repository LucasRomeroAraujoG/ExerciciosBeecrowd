import java.util.Scanner;

public class vetor1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        double[] numerosReais = new double[n];
        for(int i = 0; i<n;i++)
        {
            numerosReais[i] = sc.nextDouble();
        }
        
        int cont = 0;
        double maiorNumero = numerosReais[0];
        for(int i=0;i<n;i++)
        {
            if(maiorNumero < numerosReais[i])
            {
                maiorNumero = numerosReais[i];
                cont = i;
            }
        }
        
        System.out.printf("%.1f%n", maiorNumero);
        System.out.printf("%d%n", cont);
        
        
    
      
        sc.close();
    }
}
