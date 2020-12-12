import java.util.Scanner;

public class HolaMundo {

	public static void main(String[] args) {
		int horas_semana = 0;
		Scanner sc = new Scanner(System.in);
		float retencion , salario_bruto, dolares_retencion,salario_neto,precio_hora;
		System.out.println("Ingrese Horas Trabajadas:");
		horas_semana= sc.nextInt();
		System.out.println("Precio Horas:");
		precio_hora= sc.nextFloat();
		System.out.println("Retención:");
		retencion= sc.nextFloat();
		salario_bruto = horas_semana * precio_hora;
		dolares_retencion = salario_bruto * ( retencion / 100 );
	    salario_neto = salario_bruto - dolares_retencion;
	    System.out.println("=======================================================\n");
	    System.out.println("Horas : "+horas_semana+", Precio Hora: "+precio_hora);
	    System.out.println("Retencion: "+retencion+"%, Dolares Retenidos: "+dolares_retencion);
	    System.out.println("=======================================================\n");
	    System.out.println("**** Salario Bruto:"+salario_bruto);
	    System.out.println("**** Salario Neto: "+salario_neto);
	}
}
