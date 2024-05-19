package leyendo_escribiendo_bytes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Lectura_Escritura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int contador =0;
		
		int datos_entrada[] = new int[74130];
		try {
			FileInputStream archivo = new FileInputStream("C:/Users/MariaEsther/Desktop/imagen.jpg");
			
			boolean final_ar = false;
			
			while(!final_ar){
				
				int byte_entrada = archivo.read();
				
				if(byte_entrada!=-1)
					datos_entrada[contador]= byte_entrada;
				
				else
					
					final_ar=true;
				
				System.out.println(datos_entrada[contador]);
				contador++;
			}
			
			archivo.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(contador);
		
		crear_fichero(datos_entrada);
	}
	
	static void crear_fichero(int datos_nuevo_fichero[]){
		
		
		try {
			FileOutputStream fichero_nuevo = new FileOutputStream("C:/Users/MariaEsther/Desktop/imagen2.jpg");
			
			for(int i=0; i<datos_nuevo_fichero.length;i++){
				
				fichero_nuevo.write(datos_nuevo_fichero[i]);
			}
			fichero_nuevo.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
