package Logica;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Empresa {
	
	private ArrayList<Departamento> misDepartamentos;

	public Empresa() {
		super();
		this.misDepartamentos = new ArrayList<Departamento>();
	}
	

	public ArrayList<Departamento> getMisDepartamentos() {
		return misDepartamentos;
	}

	public void setMisDepartamentos(ArrayList<Departamento> misDepartamentos) {
		this.misDepartamentos = misDepartamentos;
	}
	
	
	
	public void regDepartamentos(ArrayList<Departamento> dep){
		
		misDepartamentos = dep;
	}
	
 public void generarFicheroDepTxt() throws IOException, ClassNotFoundException{
	 
	 // para leer fichero
		FileInputStream f = new FileInputStream ("Personas.dat");
		ObjectInputStream ooE = new ObjectInputStream(f);
		try{
			
			Departamento b = (Departamento)ooE.readObject();
		ooE.readObject();
		
		
		
	       
		
		ooE.readInt();
		//oos.writeChars("Cantidad de Trabajadores");
		ooE.readInt();
		
		for (int i = 0; i < misDepartamentos.get(i).getMisTrabajadores().size(); i++){		
			try {
				Trabajador a = (Trabajador)ooE.readObject();
				System.out.println(" leyendo fichero binario");
				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
   
     		f.close();
     		
     		File archivo = new File ("c:/fichero/dep.txt");
            FileWriter escritor;
    		
    			escritor = new FileWriter(archivo);
    			for(int i = 0; i<misDepartamentos.size();i++){
    			String info = misDepartamentos.get(i).getNombre();
    			
    			for (int a=0; a<info.length(); a++)
    	            escritor.write(info.charAt(a));
    			}
    		       
    	        
    	           
    	        
    	        escritor.close();
    		} catch (IOException e) {
    			
    			e.printStackTrace();
    		}
               
           
            System.out.println("El archivo ha sido escrito...");
 }

}
