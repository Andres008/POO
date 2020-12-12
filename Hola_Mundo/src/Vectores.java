import java.util.Scanner;

public class Vectores {

	public static void main(String[] args) {
		String[] nombres = new String[6];
		Scanner sc = new Scanner(System.in);
		
		for (int i =0; i < nombres.length;i++ ) {
			System.out.println("Ingrese el nombre: ");
			nombres[i]= sc.nextLine();
		}
		
		for (int i =0; i < nombres.length;i++ ) {
			System.out.println("Nombre Ingresado: "+nombres[i]);
		}

	}

}
