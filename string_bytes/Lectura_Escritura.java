package string_bytes;

import java.io.*;

public class Lectura_Escritura {

	public static void main(String[] args) {
		
		int contador=0;
		
		int datos_entrada[] = new int[8438]; //cantidad de bytes en la imagen
		
		try {
			FileInputStream archivo_lectura= new FileInputStream("/home/robenmy/Documents/images.png");//leyendo imagen 
			
			boolean final_ar = false;
			
			while(!final_ar) { //mientras sea verdad
				
				int byte_entrada= archivo_lectura.read(); //lee byte por byte
				
				if(byte_entrada!=-1) {
					datos_entrada[contador]=byte_entrada;//almacenando la imagen en un array
				}
				
				else { //llego final archivo
					final_ar=true;
				}
				
				System.out.println(datos_entrada[contador]);
				contador++; // contar bytes
			}
			
			archivo_lectura.close();
			
		}catch(IOException e) {
			System.out.print("Error al acceder a la imagen");
			
		}
		
		System.out.println("Cantidad de bytes: "+contador);
		
		
		crea_fichero(datos_entrada);

	}
	
	//----E S C R I B I R   U N   A R C H I V O   N U E V O ---
	
	static void crea_fichero(int datos_nuevo_fichero[]) {
		
		try {
			FileOutputStream fichero_nuevo = new FileOutputStream("/home/robenmy/Documents/images(Copia).png");
			
			for(int i=0; i<datos_nuevo_fichero.length;i++) {
				
				fichero_nuevo.write(datos_nuevo_fichero[i]);
				
			}
			
			fichero_nuevo.close();
		}catch(IOException e){
			System.out.print("Error al crear el archivo");
			
		}
	}

}
