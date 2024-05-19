package programacion_generica;

public class ClaseGenerica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Pareja<String> una = new Pareja<String>();
		
		una.setPrimero("Robenmy");
		
		System.out.println(una.getprimero());
		
		//--- segundo ejemplo de clase
		
		String nombres[]= {"Jose","maria","Pedro"};
		
		String elementos= MisMatrices.getElementos(nombres);
		System.out.println(elementos);
	}

}

class Pareja<T>{ //RECIBIRA UN DATO QUE NO SE SABE EL TIPO TODAVIA
	
	private T primero;
	
	public Pareja() {
		primero = null;
	}
	
	public void setPrimero(T nuevoValor) {
		
		primero = nuevoValor;
		
	}
	
	public T getprimero() {
		
		return primero;
	}
	
	
}


//---Otro ejemplo-----

class MisMatrices{
	
	public static <T> String getElementos(T[] a) {
		
		return "El array tiene "+ a.length +" elementos";
		
	}
}