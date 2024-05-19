package stream_ficheros;

import java.io.FileReader;
import java.io.IOException;

public class Leer_fichero {

	public static void main(String[] args) {
		
		Read_file acceso = new Read_file();
		
		acceso.read();
		

	}

}

class Read_file{
	
	public void read() {
		try {
			FileReader entrada = new FileReader("/home/robenmy/Documents/hola");
			
			int c=0;
			
			while(c!=-1) {// mientras no hallas llegado al final
				
				c=entrada.read();
				
				char letra = (char)c;
				System.out.print(letra);
				
			}
			entrada.close(); // cerrar el flujo de datos
			
		}catch(IOException e) {
			
			System.out.println("No se ha encontrado el archivo"+e);
			
		}
	}
}
