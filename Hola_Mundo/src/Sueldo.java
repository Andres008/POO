import java.util.Scanner;

public class Sueldo {

	public static void main(String[] args) {
		int horasTrabajadasSemana, horasDolaresPorHora;
		double retencion, salarioBruto, salarioNeto, precioNeto;
		Scanner leer = new Scanner(System.in);
		System.out.println("Horas trabajadas por semana");
		horasTrabajadasSemana = leer.nextInt();
		System.out.println("Dolares por Horas");
		horasDolaresPorHora = leer.nextInt();
		System.out.println("Porcentaje de rentencion");
		retencion = leer.nextDouble();
		salarioBruto = horasTrabajadasSemana* horasDolaresPorHora;
		retencion=retencion/100;
		retencion = salarioBruto*retencion;
		salarioNeto=salarioBruto-retencion;
		System.out.println("salario bruto: "+ salarioBruto);
		System.out.println("retenciòn: "+ retencion);
		System.out.println("salario neto: "+ salarioNeto);
	}

}
