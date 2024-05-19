package logica;

public class Egresado extends Student {
	
	protected float[] prom;
	protected float promTotal;
	
	
	public Egresado(String name, String apellido, String cedula, float[] prom
			) {
		super(name, apellido, cedula);
		this.prom = new float[3];
		this.promTotal = 0;
	}


	public float[] getProm() {
		return prom;
	}


	public void setProm(float[] prom) {
		this.prom = prom;
	}


	public float getPromTotal() {
		return promTotal;
	}


	public void setPromTotal(float promTotal) {
		this.promTotal = promTotal;
	}

	
	public float promedio(){
		promTotal=0;
		for(int i=0;i<3;i++){
			promTotal += prom[i];
		}
		
		return (promTotal/3);
		
	}
	
}
