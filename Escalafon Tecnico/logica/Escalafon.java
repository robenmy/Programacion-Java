package logica;

import java.util.ArrayList;





public class Escalafon {
	private ArrayList<PreUniversitario> pre;
	private ArrayList<Orden18> orden18;
	private ArrayList<StudSecundaria> secundaria;
	
	
	public Escalafon() {
		super();
		this.pre = new ArrayList<PreUniversitario>();
		this.orden18 = new ArrayList<Orden18>();
		this.secundaria = new ArrayList<StudSecundaria>();
	}


	public ArrayList<PreUniversitario> getPre() {
		return pre;
	}


	public void setPre(ArrayList<PreUniversitario> pre) {
		this.pre = pre;
	}


	public ArrayList<Orden18> getOrden18() {
		return orden18;
	}


	public void setOrden18(ArrayList<Orden18> orden18) {
		this.orden18 = orden18;
	}


	public ArrayList<StudSecundaria> getSecundaria() {
		return secundaria;
	}


	public void setSecundaria(ArrayList<StudSecundaria> secundaria) {
		this.secundaria = secundaria;
	}
	
	
	public float promeNotasMasExamen(){
		float NotaAdmicion = 0;
		
		int i=0;
		
		NotaAdmicion = (float) (0.6*(secundaria.get(i).promedioExamenes()));
		
	return (float) NotaAdmicion;
		
	}
	
	public float promeCusrsos(){
		float total = 0;
		
		
		total = secundaria.get(0).promedio() + secundaria.get(1).promedio() + secundaria.get(2).promedio() ;
		
		
		return total;
	}
	

}
