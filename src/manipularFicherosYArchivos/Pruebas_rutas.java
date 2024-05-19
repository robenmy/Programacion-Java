package manipularFicherosYArchivos;

import java.io.File;

public class Pruebas_rutas {
	
	public static void main(String[] arg) {
		
		File archivo = new File("ejemplo");
		System.out.println(archivo.getAbsolutePath());// devuelve la ruta del archivo aunque no exista
		System.out.println(archivo.exists()); // indica si existe o no el archivo
		
		///-----------------
		//File ruta = new File("/home/robenmy/Documents/");
		File ruta = new File(File.separator+"home"+File.separator+"robenmy"+File.separator+"Documents"+File.separator);
		//+File.separator devueve el tipo de barra que usa el sistema operativo ya sea "\" o "/"
		System.out.println(ruta.getAbsolutePath());
		System.out.println(ruta.list());
		
		//imprimir listados de archivos en la ruta
		String[] lista = ruta.list();
		
		for(String l: lista) {
			
			System.out.println(l);
			
			File f = new File(ruta.getAbsolutePath(), l);// pasamos la ruta y el nombre del archivo
			if(f.isDirectory()){
				String[] archivo_subcarpeta = f.list();
				
				for(String sub : archivo_subcarpeta) {
					System.out.print("--Carpeta--:"+sub+"\n");
					
				}
			}
		}
		
		
	}

}
