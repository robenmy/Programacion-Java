package Logica;

import java.io.Serializable;



public class Trabajador implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cedula;
	private String nombre;
	private float salario;
	private int horasTrabajadas;
	private float salarioMensual;
	
	public Trabajador(String cedula, String nombre, int salario,
			int horasTrabajadas) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.salario = salario;
		this.horasTrabajadas = horasTrabajadas;
		this.salarioMensual = 0;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public float getSalarioMensual() {
		return salarioMensual;
	}

	public void setSalarioMensual(float salarioMensual) {
		this.salarioMensual = salarioMensual;
	}
	
	public void salarioMensual(){
		
		salarioMensual = horasTrabajadas*salario;
	}
	

}
