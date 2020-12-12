import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int filas, columnas;
		int[][] numeros;
		System.out.print("Ingrese el numero de filas: ");
		filas = sc.nextInt();
		System.out.print("Ingrese el numero de columnas: ");
		columnas = sc.nextInt();
		numeros = new int[filas][columnas];
		for (int f = 0; f < numeros.length; f++) {
			for (int c = 0; c < numeros[f].length; c++) {
				System.out.println("Ingrese el número " + f + "," + c + ":");
				numeros[f][c] = sc.nextInt();

			}
		}

		for (int f = 0; f < numeros.length; f++) {
			for (int c = 0; c < numeros[f].length; c++) {
				System.out.print(numeros[f][c] + "\t");
			}
			System.out.println("\n");
		}

	}

}
