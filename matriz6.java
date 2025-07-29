import java.util.Scanner;

public class matriz6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		double[][] matriz = new double[n][n];

		// Recolhendo dados da matriz.
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matriz[i][j] = sc.nextDouble();
			}
		}

		// Soma dos positivos
		double somaPositivos = 0.0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (matriz[i][j] > 0) {
					somaPositivos += matriz[i][j];
				}
			}
		}

		// Leitura do indice de uma linha da matriz
		int linha = sc.nextInt();
		int coluna = sc.nextInt();

		System.out.printf("SOMA DOS POSITIVOS: %.1f%n", somaPositivos);

		System.out.print("LINHA ESCOLHIDA: ");
		for (int i = 0; i < n; i++) {
			System.out.print(matriz[linha][i] + " ");
		}
		System.out.println();

		// Leitura do indice de uma coluna da matriz

		System.out.print("COLUNA ESCOLHIDA: ");
		for (int i = 0; i < n; i++) {
			System.out.print(matriz[i][coluna] + " ");
		}
		System.out.println();

		// Imprimir a diagonal da matriz

		System.out.print("DIAGONAL PRINCIPAL: ");
		for (int i = 0; i < n; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		System.out.println();

		// Alterar os valores negativos elevando ao quadrado todos os numeros.

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (matriz[i][j] < 0) {
					matriz[i][j] = Math.pow(matriz[i][j], 2);
				}
			}
		}

		System.out.println("MATRIZ ALTERADA: ");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}

}
