package leyendo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Acceso_Fichero {

	public static void main(String[] args) {
		
		Leer_Fichero leer = new Leer_Fichero();

		leer.lee();
	}

}


class Leer_Fichero{
	
	
	
	
	public void lee(){
		int c =0;
		
		try {
			FileReader entrada = new FileReader("C:/Users/MariaEsther/Desktop/ejemplo.txt");
			
			BufferedReader  mibuffer = new BufferedReader(entrada);
			
			String linea = "";
			
			
			
			while(linea!=null){ /* para leer carater por caracter tenia "c!=null"*/
				
				//c = entrada.read();
				//char letra = (char)c;
				
				linea = mibuffer.readLine();
				System.out.println(linea);
				//System.out.println(letra);
			}
			
			entrada.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No se ha encontrado el archivo");
		}
		
		
		
		
	}
	
}