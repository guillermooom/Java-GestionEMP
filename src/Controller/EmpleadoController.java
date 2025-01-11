package Controller;

import java.util.ArrayList;

import Model.Empleado;

public class EmpleadoController {

	public static void VerEmple(Empleado emp) {
		System.out.println("*** DATOS EMPLEADO ***");
		System.out.println("DNI -> "+emp.getDni());
		System.out.println("NOMBRE -> "+emp.getNombre()+" "+emp.getApellido());
		System.out.println("SALARIO -> "+emp.getSalario());
	}
	
	public static void TodosEmple(ArrayList<Empleado> list) {
		System.out.println("\n *** EMPLEADOS ***");
		
		for(Empleado emp : list ) {
			System.out.println("DNI -> "+emp.getDni());
			System.out.println("NOMBRE -> "+emp.getNombre()+" "+emp.getApellido());
			System.out.println("SALARIO -> "+emp.getSalario());
			System.out.println("-------------------------------");
		}
	}
	
}
