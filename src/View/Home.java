package View;

import java.util.Scanner;

import Model.Empleado;

public class Home {

	public static void main(String[] args) {

		//cracion del Scaner
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Cual es tu nombre: ");
		String name = scan.nextLine();
		
		System.out.println("Hola, " + name + "!\n");
		
		//Cerramos Scaner
		scan.close();
		
		
		//Creaicon empleado
		Empleado emp1 = new Empleado() {};
		Empleado emp2 = new Empleado("000000000X","Guillermo","Moreno",12.0);
		
		
		VerEmple(emp2);
		
	}
	
	//Ver datos empleado
	public static void VerEmple(Empleado emp) {
		System.out.println("*** DATOS EMPLEADO ***");
		System.out.println("DNI -> "+emp.getDni());
		System.out.println("NOMBRE -> "+emp.getNombre()+" "+emp.getApellido());
		System.out.println("SALARIO -> "+emp.getSalario());
	} 

}
