package Controller;

import java.util.ArrayList;
import java.util.Scanner;

import Model.Empleado;

public class EmpleadoController {

	//metodo para ver los datos de un empleado, pasandoselo entero
	public static void VerEmple(Empleado emp) {
		System.out.println("\n*** DATOS EMPLEADO ***");
		System.out.println("DNI -> "+emp.getDni());
		System.out.println("NOMBRE -> "+emp.getNombre()+" "+emp.getApellido());
		System.out.println("SALARIO -> "+emp.getSalario());
		System.out.println("AVISOS -> "+emp.getAvisos());
	}
	
	//ver todos los empleados del arraylist
	public static void TodosEmple(ArrayList<Empleado> list) {
		System.out.println("\n *** EMPLEADOS ***");
		
		for(Empleado emp : list ) {
			System.out.println("DNI -> "+emp.getDni());
			System.out.println("NOMBRE -> "+emp.getNombre()+" "+emp.getApellido());
			System.out.println("SALARIO -> "+emp.getSalario());
			System.out.println("AVISOS -> "+emp.getAvisos());
			System.out.println("-------------------------------");
		}
	}
	
	public static void BuscarDni(ArrayList<Empleado> e,String dni) {
		dni = dni.trim();
		boolean encontrado=false;
		
		for(Empleado emp : e) {
			if(emp.getDni().equals(dni)) {
				VerEmple(emp);
				encontrado=true;
			}
		}
		
		if(!encontrado) {
			System.out.println("No se ha encontrado un Empleado con ese DNI");
		}
	}
	
	public static void BuscarNombre(ArrayList<Empleado> e,String nb) {
		boolean encontrado=false;
		nb = nb.trim();
		
		for(Empleado emp : e) {
			String comp = emp.getNombre()+emp.getApellido();
			if(comp.toLowerCase().contains(nb.toLowerCase())) {
				System.out.println("Encontrado");
				VerEmple(emp);
				encontrado=true;
			}
		}
		
		if(!encontrado) {
			System.out.println("No se ha encontrado un Empleado con ese Nombre");
		}
	}
	
	public static void DarAviso(ArrayList<Empleado> e,String dni) {
		dni = dni.trim();
		for(Empleado emp : e) {
			if(emp.getDni().equals(dni)) {
				emp.setAvisos(emp.getAvisos() + 1);
			}
		}
	}
	
}
