package programacion_generica;

import java.util.ArrayList;
import java.util.Iterator;

//los arraylist solo pueden almacenar objetos, no pueden almacenar datos primitivos

public class Arraylist_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Administrador Jefe = new Administrador("Juan");
		
		ArrayList<Administrador> lista = new ArrayList<Administrador>();
		ArrayList<String> lista7 = new ArrayList<String>();
	
		
		
		
		lista.ensureCapacity(3); // le indica al arraylist que reserve memoria para 3, y asi se optimiza el arraylist
		lista.add(Jefe);
		
		lista.trimToSize(); // se usa si estas seguro que no se almacenaran mas elementos y corta el exceso de memoria
		
 
		System.out.println(lista.get(0));
		
		//-------------- Pasar de un arrayList a array convencional ----------
		
		Administrador ad[] = new Administrador[lista.size()];
		
		lista.toArray(ad);
		
		//--- Ieradores para recorrer elementos por secuencia
		
		Iterator<Administrador> mi_iterador =  lista.iterator();
		
		
		while(mi_iterador.hasNext()) {
			System.out.println(mi_iterador.next());
			
		}
		
	}

}


class Administrador {
	/**
	 el serial version permite que si se cambia el nombre de una variable
	 si el programa en el otro lado de la red no esta actualizado pueda leer
	 los datos
	 
	 Si tiene el mismo serial version el programa puede ser leido.
	 */
	
	private String name;
	
	public Administrador(String name) {
		this.name=name;
		
	}
	
	public String toString() {
		return "Nombre: "+this.name;
		
		
	}
}