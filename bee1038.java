import java.util.Scanner;

public class bee1038 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int codigoDoItem, quantidadeDoItem;
	codigoDoItem = sc.nextInt();
	quantidadeDoItem = sc.nextInt();
	
	double valorAPagar, precoDoItem;
	
	if(codigoDoItem == 1) {
		precoDoItem = 4.00;
		valorAPagar = precoDoItem * quantidadeDoItem;
		System.out.printf("Total: R$ %.2f%n", valorAPagar);
	}
	else if (codigoDoItem == 2) {
		precoDoItem = 4.50;
		valorAPagar = precoDoItem * quantidadeDoItem;
		System.out.printf("Total: R$ %.2f%n", valorAPagar);
	}
	else if (codigoDoItem == 3) {
		precoDoItem = 5.00;
		valorAPagar = precoDoItem * quantidadeDoItem;
		System.out.printf("Total: R$ %.2f%n", valorAPagar);
	}
	else if (codigoDoItem == 4) {
		precoDoItem = 2.00;
		valorAPagar = precoDoItem * quantidadeDoItem;
		System.out.printf("Total: R$ %.2f%n", valorAPagar);
	}
	else if (codigoDoItem == 5) {
		precoDoItem = 1.50;
		valorAPagar = precoDoItem * quantidadeDoItem;
		System.out.printf("Total: R$ %.2f%n", valorAPagar);
	}
	
	sc.close();
	}

}
