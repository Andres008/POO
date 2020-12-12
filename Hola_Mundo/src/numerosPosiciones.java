import java.util.Scanner;

public class numerosPosiciones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el tamaño del vector:");
		int[] numeros = new int[sc.nextInt()];
		for (int i = 0; i < numeros.length; i++) {
			if (i % 2 == 0)
				numeros[i] = 0;
			else
				numeros[i] = 1;
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + ",");
		}

	}

}
