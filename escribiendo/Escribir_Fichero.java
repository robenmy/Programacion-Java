package escribiendo;

import java.io.FileWriter;
import java.io.IOException;

public class Escribir_Fichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Escribiendo texto = new Escribiendo();
		
		texto.escribir();
	}

}

 class Escribiendo{
	
	public void escribir(){
		
		String Frase = "Esto es una prueba de escritura";
		
		
		try {
			FileWriter escritura = new FileWriter("C:/Users/MariaEsther/Desktop/ejemplo.txt");
			
			for(int i=0; i<Frase.length(); i++){
				
				
				
				escritura.write(Frase.charAt(i));
			}
			
			escritura.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	
}