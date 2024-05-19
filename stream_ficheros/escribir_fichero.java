package stream_ficheros;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class escribir_fichero {

	public static void main(String[] args) {
		
		Write_file escritura = new Write_file();
		
		escritura.write();
		

	}

}


class Write_file{
	
	public void write() {
		
		String frase = "Learn while others sleep";
		
		try {
			FileWriter escritura = new FileWriter("/home/robenmy/Documents/nuevo.txt",true);
			//true inddica si el fichero existe, continue escribiendo
			
			for(int i=0;i<frase.length();i++) {
				
				escritura.write(frase.charAt(i));
			}
			
			escritura.close();
			System.out.println("Fichero escrito");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
