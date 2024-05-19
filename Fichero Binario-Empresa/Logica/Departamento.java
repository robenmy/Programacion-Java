package Logica;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Departamento implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String nombre;
	private ArrayList<Trabajador> misTrabajadores;
	int cant;
	
	
	public Departamento(String id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.misTrabajadores = new ArrayList<Trabajador>();
		cant=0;
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


	public ArrayList<Trabajador> getMisTrabajadores() {
		return misTrabajadores;
	}


	public void setMisTrabajadores(ArrayList<Trabajador> misTrabajadores) {
		this.misTrabajadores = misTrabajadores;
	}
	
	
	public void regTrabajador(ArrayList<Trabajador> trabajadores){
		
		misTrabajadores = trabajadores;
	}
	
	
	
	public int getCant() {
		return cant;
	}


	public void setCant(int cant) {
		this.cant = cant;
	}


	public void cantTrabajadores(){
		 cant = misTrabajadores.size();
		
	}
	
	
	public void generarFicheroDep() throws IOException{
		
		
		

	
		FileOutputStream fs = new FileOutputStream ("Personas.dat");
		ObjectOutputStream oos 	= new ObjectOutputStream (fs);//*/
		//oos.writeChars(nombre);
		oos.writeObject(nombre);
		
       
        		
        		oos.writeInt(misTrabajadores.size());
        		//oos.writeChars("Cantidad de Trabajadores");
        		oos.writeInt(cant);
              
        		for (int i = 0; i < misTrabajadores.size(); i++){		
        			
        			oos.writeObject(misTrabajadores.get(i));
        			
        		}
        		
        		fs.close();
        		System.out.println("El fichero binario ha sido creado exitosamente");
        		
        		
        		
		
		
	}

}
