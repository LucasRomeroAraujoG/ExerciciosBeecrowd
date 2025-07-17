import java.util.Scanner;

public class bee1066 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int num5 = sc.nextInt();
		
		int pares = 0;
		int impares = 0;
		int positivo = 0;
		int negativo = 0;
		
		//Verificando se é par ou impar
		
		if (num1 % 2 == 0)
		{
			pares+=1;
		}
		else {
			impares+=1;
		}
		if (num2 % 2 == 0)
		{
			pares+=1;
		}
		else {
			impares+=1;
		}
		if (num3 % 2 == 0)
		{
			pares+=1;
		}
		else {
			impares+=1;
		}
		if (num4 % 2 == 0)
		{
			pares+=1;
		}
		else {
			impares+=1;
		}
		if (num5 % 2 == 0)
		{
			pares+=1;
		}
		else {
			impares+=1;
		}
		
		// Verificando positivos e negativos
		
		if (num1 >= 1)
		{
			positivo+=1;
		}
		else if (num1 < 0){
			negativo+=1;
		}
		if (num2 >= 1)
		{
			positivo+=1;
		}
		else if (num2 < 0){
			negativo+=1;
		}
		if (num3 >= 1)
		{
			positivo+=1;
		}
		else if (num3 < 0){
			negativo+=1;
		}
		if (num4 >= 1)
		{
			positivo+=1;
		}
		else if (num4 < 0){
			negativo+=1;
		}
		if (num5 >= 1)
		{
			positivo+=1;
		}
		else if (num5 < 0){
			negativo+=1;
		}
		
		System.out.printf("%d valor(es) par(es)%n", pares);
		System.out.printf("%d valor(es) impar(es)%n", impares);
		System.out.printf("%d valor(es) positivo(s)%n", positivo);
		System.out.printf("%d valor(es) negativo(s)%n", negativo);
		
		sc.close();
	}
}
