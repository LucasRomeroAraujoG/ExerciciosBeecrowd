import java.util.Scanner;

public class vetor2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int vet[] = new int[n];
        for(int i=0;i<n;i++)
        {
            vet[i] = sc.nextInt();
        }
      
        int cont = 0;
        for(int pares : vet)
        {
            if(pares%2==0)
            {
                System.out.printf("%d ", pares);
                cont++;
            }
        }
        System.out.println();
        System.out.println(cont);
        sc.close();
    }
}
