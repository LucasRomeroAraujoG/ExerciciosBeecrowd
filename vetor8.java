import java.util.Scanner;

public class vetor8
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
         
        double altura[] = new double[n];
        char sexo[] = new char[n];
        
        for(int i=0;i<n;i++)
        {
            altura[i] = sc.nextDouble();
            sexo[i] = sc.next().charAt(0);
        }
        
        //Descobrir menor altura e maior altura
        double menorAltura = altura[0];
        double maiorAltura = altura[0];
        
        for(int i=0;i<n;i++)
        {
         if(altura[i] > maiorAltura)
         {
             maiorAltura = altura[i];
         }
         if(altura[i] < menorAltura)
         {
             menorAltura = altura[i];
         }
        }
        
        System.out.printf("Menor altura = %.2f%n", menorAltura);
        System.out.printf("Maior altura = %.2f%n", maiorAltura);
        
        // Descobrir a media de altura das mulheres
        
        double mediaAltura = 0.0;
        int contM = 0;
        for (int i=0;i<n;i++)
        {
            if(sexo[i] == 'F')
            {
                mediaAltura += altura[i];
                contM++;
            }
        }
        mediaAltura /= contM;
        
        System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAltura);
        
        //Descobrir a quantidade de homens
        int nmrH = 0;
        for(int i = 0;i<n;i++)
        {
            if(sexo[i] == 'M')
            {
                nmrH++;
            }
        }
        System.out.printf("Numero de homens = %d%n", nmrH);
        
        sc.close();
    }
}
