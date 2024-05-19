package stream_ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Leer_buffer {
	// un buffer se utiliza como memoria intermedia 
	//para una lectura mas rapida y eficiente

	public static void main(String[] args) {
		
		Read_buffer read = new Read_buffer();
		
		read.read();
		

	}

}


class Read_buffer{
	
	public void read() {
		try {
			FileReader entrada = new FileReader("/home/robenmy/Documents/hola");
			
			BufferedReader mibuffer = new BufferedReader(entrada);
			
			String linea="";
			
			while(linea!=null) { //readline lee una linea de texto y termina con \n				
				
				linea=mibuffer.readLine();
				
				if(linea!=null) {
				System.out.println(linea);
				}
				
			}
			entrada.close(); // cerrar el flujo de datos
			
		}catch(IOException e) {
			
			System.out.println("No se ha encontrado el archivo"+e);
			
		}
	}
}
