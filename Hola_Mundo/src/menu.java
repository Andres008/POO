import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int valorMenu;
		do {
			System.out.println("------Menu Operaciones----");
			System.out.println("1.- Ejemplo 1");
			System.out.println("2.- Ejemplo 2");
			System.out.println("0.- Salir");
			valorMenu = sc.nextInt();
			
		}while( valorMenu!=0);
		System.out.println("Gracias por su visita.");
	}
	
	private static String holaMundo() {
		return "Hola Mundo";
	}

}
