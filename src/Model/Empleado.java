package Model;

public class Empleado {

	String dni;
	String nombre;
	String apellido;
	Double salario;
	int avisos;
	
	public Empleado (){}
	
	public Empleado(String dni, String nombre, String apellido, Double salario,int avisos) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
		this.avisos = avisos;
	}


	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public int getAvisos() {
		return avisos;
	}
	public void setAvisos(int avisos) {
		this.avisos = avisos;
	}
	
}
