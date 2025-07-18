import java.util.Scanner;

public class bee1114 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int senhaCorreta = sc.nextInt();
        
        while(senhaCorreta != 2002)
        {
            System.out.println("Senha Invalida");
            senhaCorreta = sc.nextInt();
        }
        if(senhaCorreta == 2002)
        {
            System.out.println("Acesso Permitido");
        }
 
        sc.close();
    }
 
}
