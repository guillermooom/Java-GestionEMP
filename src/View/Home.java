package View;

import Model.Empleado;

public class Home {

	public static void main(String[] args) {

		Empleado emp1 = new Empleado() {};
		Empleado emp2 = new Empleado("0x","Guille","Moreno",12.0);
		
		VerEmple(emp2);
		
	}
	
	public static void VerEmple(Empleado emp) {
		System.out.println("*** DATOS EMPLEADO ***");
		System.out.println("DNI -> "+emp.getDni());
		System.out.println("NOMBRE -> "+emp.getNombre()+" "+emp.getApellido());
		System.out.println("SALARIO -> "+emp.getSalario());
	} 

}
