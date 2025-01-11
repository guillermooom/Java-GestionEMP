package View;

import java.util.ArrayList;
import java.util.Scanner;

import Controller.EmpleadoController;
import Model.Empleado;

public class Home {

	public static void main(String[] args) {

		//cracion del Scaner
		Scanner scan = new Scanner(System.in);
		
		menu();
		
		int opc = scan.nextInt();		
		
		//Creaicon empleado
		Empleado emp1 = new Empleado("000000000X","Guillermo","Moreno",1200.0);
		Empleado emp2 = new Empleado("000000000A","Ana","Pedrosas",900.0);
		
		//meterlo en un arraylist
		ArrayList<Empleado> listaEmp = new ArrayList<>();
		listaEmp.add(emp1);
		listaEmp.add(emp2);
		
		//EmpleadoController.VerEmple(emp1);
		
		while(opc != 0) {
			switch(opc) {
			case 1:
				EmpleadoController.TodosEmple(listaEmp);

			break;
			
			case 2:
				System.out.print("Introduzca el DNI -> ");
				scan.nextLine();
				String dni = scan.nextLine();
				EmpleadoController.BuscarDni(listaEmp, dni);
			break;
			
			}
			
			menu();
			opc = scan.nextInt();	
			
		}
		
		System.out.println("Saliendo...");
		
		//Cerramos Scaner
		scan.close();
		
	}
	
	public static void menu () {
		System.out.println("\n\n===== GESTION EMPLEADOS =====");
		System.out.println("1. Ver Todos empleados");
		System.out.println("2. Buscar Empleado");
		System.out.println("0. Salir");
		System.out.print("-> ");
	}
	

}
