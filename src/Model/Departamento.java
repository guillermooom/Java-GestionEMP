package Model;

public class Departamento {

	String id;
	String nombre;
	String Ciudad;
	
	
	public Departamento() {}

	public Departamento(String id, String nombre, String ciudad) {
		super();
		this.id = id;
		this.nombre = nombre;
		Ciudad = ciudad;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return Ciudad;
	}

	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}
	
	
}
