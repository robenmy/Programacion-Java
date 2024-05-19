package logica;

public class Orden18 extends Student{
	private float nivelacion;

	
	public Orden18(String name, String apellido, String cedula, float nivelacion) {
		super(name, apellido, cedula);
		this.nivelacion = nivelacion;
	}


	public float getNivelacion() {
		return nivelacion;
	}


	public void setNivelacion(float nivelacion) {
		this.nivelacion = nivelacion;
	}
	
	

}
