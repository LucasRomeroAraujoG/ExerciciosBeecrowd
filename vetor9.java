Exercicio 9: 

import java.util.Scanner;

public class vetor9
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
         
        String produto[] = new String[n];
        double pCompra[] = new double[n];
        double pVenda [] = new double[n];
        
        for(int i=0;i<n;i++)
        {
            produto[i] = sc.next();
            pCompra[i] = sc.nextDouble();
            pVenda[i] = sc.nextDouble();
        }
        
        int lAbaixo = 0;
        int lMeio = 0;
        int lAcima = 0;
        for(int i=0;i<n;i++)
        {
            if(((pVenda[i] - pCompra[i]) / pCompra[i]) * 100 < 10)
            {
                lAbaixo++;
            }
            else if(((pVenda[i] - pCompra[i]) / pCompra[i]) * 100 < 20)
            {
                lMeio++;
            }
            else
            {
                lAcima++;
            }
        }
        
        System.out.println("Lucro abaixo de 10%: " + lAbaixo);
        System.out.println("Lucro entre 10% e 20%: " + lMeio);
        System.out.println("Lucro acima de 20%: " + lAcima);
        
        double valorDeCompra = 0.0;
        double valorDeVenda = 0.0;
        
    
        for(int i=0;i<n;i++)
        {
            valorDeCompra += pCompra[i];
            valorDeVenda += pVenda[i];
        }
        
        double lucroTotal = valorDeVenda - valorDeCompra;
        
        System.out.printf("Valor total de compra: %.2f%n", valorDeCompra);
        System.out.printf("Valor total de venda: %.2f%n", valorDeVenda);
        System.out.printf("Lucro total: %.2f%n", lucroTotal);
    
        sc.close();
    }
}
