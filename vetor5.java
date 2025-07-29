import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int vet[] = new int[n];
        
        for(int i = 0; i<n ;i++)
        {
            vet[i] = sc.nextInt();
        }
       
       double mediaAritmetica = 0.0;
       int cont = 0;
       for(int pares : vet)
       {
           if(pares%2==0)
           {
            mediaAritmetica += pares;  
            cont++;
           }
       }
       
       mediaAritmetica /= cont;
       
       System.out.printf("%.1f%n", mediaAritmetica);
       
        sc.close();
    }
}
