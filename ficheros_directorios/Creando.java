package ficheros_directorios;

import java.io.File;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;

public class Creando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File ruta = new File("c:" + File.separator +"Users" + File.separator +"MariaEsther"+ File.separator + "Desktop"+ File.separator +"java_ser"+ File.separator +"ejemplo.txt");

		//ruta.mkdirs(); /// te crea directorio que agregaste a la ruta y no existia
		
		
		String archivo_destino = ruta.getAbsolutePath();
		try {
			ruta.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		Escribiendo accede_es = new Escribiendo();
		
		accede_es.escribir(archivo_destino);
	}

}


class Escribiendo{
	
	
	public void escribir(String ruta_archivo){
		
		String frase = " Esto es un ejemplo. Espero que salga";
		
		try{
		FileWriter escritura = new FileWriter(ruta_archivo);
		
		for(int i=0; i<frase.length(); i++){
			
			escritura.write(frase.charAt(i));
		}
		
		escritura.close();
		}catch(IOException e){
			
			
		}
		
		
	}
}