import java.util.Scanner;

public class vetor6
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        String nome[] = new String[n];
        int idade[] = new int[n]; 
        
        for(int i=0;i<n;i++)
        {
            nome[i] = sc.next();
            idade[i] = sc.nextInt();
        }
        
        int maisVelho = 0;
        String pessoaMaisVelha = " ";
        
        
        for(int i = 0;i<n;i++)
        {
            if(idade[i] > maisVelho)
            {
                pessoaMaisVelha = nome[i];
                maisVelho = idade[i];
            }
        }
        
        System.out.println("Pessoa mais velha: " + pessoaMaisVelha);
        
        sc.close();
    }
}
