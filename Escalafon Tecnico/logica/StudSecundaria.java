package logica;

public class StudSecundaria extends Egresado {
	
	private float[] promex;
    private float promTotal;

    
	
	
	
public StudSecundaria(String name, String apellido, String cedula,
			float[] prom, float[] promex) {
		super(name, apellido, cedula, prom);
		this.promex = new float[3];
		this.promTotal = 0;
	}





public float[] getPromex() {
	return promex;
}





public void setPromex(float[] promex) {
	this.promex = promex;
}





public float getPromTotal() {
	return promTotal;
}





public void setPromTotal(float promTotal) {
	this.promTotal = promTotal;
}





public float promedioExamenes(){
	promTotal=0;
		for(int i=0;i<3;i++){
			promTotal += promex[i];
		}
		
		return (promTotal/3);
		
	}

}
