import java.util.Scanner;
public class bee1005 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		double A, B, MEDIA;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		
		MEDIA = ((A * 3.5) + (B * 7.5)) / 11 ;
		
		System.out.printf("MEDIA = %.5f%n", MEDIA);
		
		sc.close();
	}
	
}
