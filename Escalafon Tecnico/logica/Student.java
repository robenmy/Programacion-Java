package logica;

public abstract class Student {
	protected String name;
	protected String apellido;
	protected String cedula;
	
	public Student(String name, String apellido, String cedula) {
		super();
		this.name = name;
		this.apellido = apellido;
		this.cedula = cedula;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	
	

}
