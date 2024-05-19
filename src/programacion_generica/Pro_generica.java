package programacion_generica;

//import java.util.ArrayList;

public class Pro_generica {

	public static void main(String[] args) {
		// Esta clase es un ejemplo de como crear un arraylist propio
		
		ArrayList archivos = new ArrayList(6);
		
		
		archivos.add("hola");
		archivos.add("hola_1");
		archivos.add("hola_2");
		archivos.add("hola_3");
		
		String datos = (String) archivos.get(3);
		
		
		System.out.print(datos);

	}

}


class ArrayList{
	private Object[] datosElemento;
	private int i =0;
	
	
	public ArrayList(int z) {
		datosElemento = new Object[z];
		
	}
	
	public Object get(int i) {
		return datosElemento[i];//devuelve un elemento
	}
	
	public void add(Object o) {
		datosElemento[i] = o;
		i++;
		
	}
}