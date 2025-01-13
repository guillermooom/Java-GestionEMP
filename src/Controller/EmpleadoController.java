package Controller;

import java.util.ArrayList;
import java.util.Iterator;
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
		System.out.println("\n *** EMPLEADOS ***\n");
		
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
	
	//damos avisos y si tiene mas de 4 te despiden usando el Iterator
	public static void DarAviso(ArrayList<Empleado> e, String dni) {
		boolean encontrado=false;
	    dni = dni.trim();
	    Iterator<Empleado> iterator = e.iterator(); // Crea un iterador para recorrer el array mejor
	    while (iterator.hasNext()) {
	        Empleado emp = iterator.next();
	        
	        if (emp.getDni().equals(dni)) {
	            emp.setAvisos(emp.getAvisos() + 1);
	            System.out.println("El empleado " + emp.getNombre() + " " + emp.getApellido() + " tiene " + emp.getAvisos() + " avisos");
	            encontrado=true;
	        }
	        
	        if (emp.getAvisos() >= 4) {
	            System.out.println( emp.getNombre() + " " + emp.getApellido()+" HA SIDO DESPEDIDO");
	            iterator.remove(); // Elimina el empleado de la lista de forma segura
	        }
	    }
	    if(!encontrado) {
        	System.out.println("No se ha encontrado el empleado");
        }
	}

	
	public static void Despedir(ArrayList<Empleado> e, String dni) {
		boolean encontrado=false;
	    dni = dni.trim();
	    Iterator<Empleado> iterator = e.iterator(); // Crea un iterador para recorrer el array mejor
	    while (iterator.hasNext()) {
	        Empleado emp = iterator.next();
	        
	        if (emp.getDni().equals(dni)) {
	            System.out.println( emp.getNombre() + " " + emp.getApellido()+" ha sido despedido");
	            iterator.remove(); // Elimina el empleado de la lista de forma segura
	            encontrado=true;
	        }
	    }
	    if(!encontrado) {
        	System.out.println("No se ha encontrado el empleado");
        }
	}
	
	
}
