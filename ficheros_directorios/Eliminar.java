package ficheros_directorios;

import java.io.File;

public class Eliminar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		File ruta = new File("c:" + File.separator +"Users" + File.separator +"MariaEsther"+ File.separator + "Desktop"+ File.separator +"java_ser"+ File.separator +"ejemplo.txt");

		ruta.delete(); //para borrar un archivo especificado
	}

}
