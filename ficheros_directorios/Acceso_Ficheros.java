package ficheros_directorios;

import java.io.File;

public class Acceso_Ficheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File ruta = new File("c:" + File.separator +"Users" + File.separator +"MariaEsther"+ File.separator + "Desktop"+ File.separator +"java_ser");
		
		System.out.println(ruta.getAbsolutePath());
		
		String[] nombres_archivos = ruta.list();
		
		for(int i=0; i<nombres_archivos.length; i++){
			
			System.out.println(nombres_archivos[i]);
			
			File f = new File(ruta.getAbsolutePath(),nombres_archivos[i]);
			
			if(f.isDirectory()){
				
				String[] archivos_subcarpetas = f.list();
				
				for(int j=0; j< archivos_subcarpetas.length; j++){
					
					System.out.println(archivos_subcarpetas[j]);
					
				}
			}
		}

	}

}
