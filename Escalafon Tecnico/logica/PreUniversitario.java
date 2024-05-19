package logica;

public class PreUniversitario extends Egresado{
	
	private float[] promex;


public PreUniversitario(String name, String apellido, String cedula,
			float[] prom, float[] promex) {
		super(name, apellido, cedula, prom);
		this.promex = new float[2];
	}



public float[] getPromex() {
	return promex;
}


public void setPromex(float[] promex) {
	this.promex = promex;
}



public float promedioExamenes(){
	promTotal=0;
		for(int i=0;i<2;i++){
			promTotal += promex[i];
		}
		
		return (promTotal/2);
		
	}


	

}
