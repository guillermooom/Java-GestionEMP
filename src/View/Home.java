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
		Empleado emp1 = new Empleado("000000000X","Guillermo","Moreno",1200.0,2);
		Empleado emp2 = new Empleado("000000000A","Ana","Pedrosas",900.0,0);
		Empleado emp3 = new Empleado("000000001A","Ana","Luisa",850.0,0);
		Empleado emp4 = new Empleado("000000000L","Luis","Pedrosas",1150.0,0);
		
		//meterlo en un arraylist
		ArrayList<Empleado> listaEmp = new ArrayList<>();
		listaEmp.add(emp1);
		listaEmp.add(emp2);
		listaEmp.add(emp3);
		listaEmp.add(emp4);
		
		while(opc != 0) {
			String dni;
			switch(opc) {
			case 1:
				EmpleadoController.TodosEmple(listaEmp);

			break;
			
			case 2:
				scan.nextLine();
				busqueda();
				int o = scan.nextInt();
				
				while(o != 0) {
					switch(o) {
					case 1:
						System.out.print("Introduzca el DNI -> ");
						scan.nextLine();
						dni = scan.nextLine();
						EmpleadoController.BuscarDni(listaEmp, dni);
						
					break;
					
					case 2:
						System.out.print("Introduzca el Nombre -> ");
						scan.nextLine();
						String nb = scan.nextLine();
						EmpleadoController.BuscarNombre(listaEmp, nb);
					break;
					
					default:
						System.out.println("\n--- Opcion no valida ---");
					
						busqueda();
						opc = scan.nextInt();
					
					}
					
					break;
					
				}
				
				break;
				
			case 3:
				System.out.print("Introduzca el DNI -> ");
				scan.nextLine();
				dni = scan.nextLine();
				EmpleadoController.DarAviso(listaEmp, dni);
			break;
			
			case 4:
				System.out.print("Introduzca el DNI -> ");
				scan.nextLine();
				dni = scan.nextLine();
				EmpleadoController.Despedir(listaEmp, dni);
			break;
				
			 default:
				 System.out.println("\n--- Opcion no valida ---");
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
		System.out.println("2. Buscar empleado");
		System.out.println("3. Dar aviso a un empleado");
		System.out.println("4. Despedir empleado");
		System.out.println("0. Salir");
		System.out.print("-> ");
	}
	
	public static void busqueda() {
		System.out.println("\n*** COMO DESEAS BUSCAR ***");
		System.out.println("1. DNI");
		System.out.println("2. Nombre");
		System.out.println("0. Cancelar");
		System.out.print("-> ");
	}
	

}
