import java.util.Scanner;

public class vetor4
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
       double vet[] = new double[n];
       
       for(int i=0;i<n;i++)
       {
           vet[i] = sc.nextDouble();
       }
       
       double mediaAritmetica = 0.0;
       for(int i=0;i<n;i++)
       {
           mediaAritmetica += vet[i];
       }
       
       mediaAritmetica = (double) mediaAritmetica / n;
       System.out.printf("%.3f%n", mediaAritmetica);
       
       for(double abaixoMedia : vet)
       {
           if(abaixoMedia < mediaAritmetica)
           {
               System.out.println(abaixoMedia);
           }
       }
       
       
       
        sc.close();
    }
}
