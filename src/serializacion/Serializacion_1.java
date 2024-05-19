package serializacion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Serializar consiste en convertir un objeto en una sucesion de bytes
//con el objetivo de poder almacenar un objeto en un discoduro o almacenamiento
// para distribuir el objeto a traves de la red
// Serializacion es covertir en bytes.
//los objetos que pertenecen a la clase resializable son sucectibles de convertirse eb bytes
public class Serializacion_1 {
	
	public static void main(String[] args) {
		
		Administrador jefe = new Administrador("Juan");
		Administrador empleado = new Administrador("Juan");
		
		Administrador[] person = new Administrador[2];
		
		person[0] = jefe;
		person[1] = empleado;
		
		try {
			
			ObjectOutputStream escribiendo_fichero = new ObjectOutputStream(new FileOutputStream("/home/robenmy/Documents/Data"));
			
			escribiendo_fichero.writeObject(person);
			escribiendo_fichero.close();
			System.out.println("Escrito");
			
			//--------------leer objeto
			ObjectInputStream leyendo_fichero = new ObjectInputStream(new FileInputStream("/home/robenmy/Documents/Data"));
			
			Administrador[] person_recuperado =(Administrador[]) leyendo_fichero.readObject(); //hay que agregar casting porque se lee un objeto tipo object
			leyendo_fichero.close();
			
			for(Administrador a: person_recuperado) {
				
				System.out.println(a);
				
			}
		}catch(Exception e){
			
			System.out.println(e);
			
		}
		
		
	}
	

}


//clase serializablede ejemplo-----------------
// si se envia el objeto por la red, la otra persona debe tener exactamente el mismo programa
//SHA es la huella identificativa del programa que la genera el compilador automaticamente
//uid consisted  en un numero de 20bytes
class Administrador implements Serializable{
	/**
	 el serial version permite que si se cambia el nombre de una variable
	 si el programa en el otro lado de la red no esta actualizado pueda leer
	 los datos
	 
	 Si tiene el mismo serial version el programa puede ser leido.
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	
	public Administrador(String name) {
		this.name=name;
		
	}
	
	public String toString() {
		return "Nombre: "+this.name;
		
		
	}
}
//objectOutputString: desde dentro hacia fuera
//objectOutputString: desde fuera hacia dentro
//writeObject: crea el objeto o sucesion de bytes para lanzar hacia fuera
//readObject: lee la sucecion de byte entrante