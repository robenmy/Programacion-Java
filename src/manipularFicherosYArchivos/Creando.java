package manipularFicherosYArchivos;

import java.io.File;
import java.io.IOException;

public class Creando {

	public static void main(String[] args) {
		File ruta = new File(File.separator+"home"+File.separator+"robenmy"+File.separator+"Documents"+File.separator+"Nueva Carpeta");
		File ruta_1 = new File(File.separator+"home"+File.separator+"robenmy"+File.separator+"Documents"+File.separator+"Nueva Carpeta"+File.separator+"hola.txt");
		ruta.mkdir(); // crea nuevo directorio
		
		try {
			ruta_1.createNewFile(); // crear nuevo archivo
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
