package sobreEscrituraDeMiembros;

public class Persona extends animal {
	
	@Override  // significa que se esta sobreescribiendo el metodo del que hereda
	public void comer() {
		System.out.println("Estoy comiendo sentado y con cubiertos");
	}
	

}
