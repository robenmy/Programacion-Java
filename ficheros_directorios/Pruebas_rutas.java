package ficheros_directorios;

import java.io.File;

public class Pruebas_rutas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File archivo = new File("ejemplo archivo");
		
		System.out.println(archivo.getAbsolutePath()); //para ver ruta donde esta ubicado el archivo
		System.out.println(archivo.exists()); // para ver si existe el archivo
	}

}
