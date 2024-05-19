package herencia;

public class Student extends Person {
 
	private String curse;
	private float[] marksArray;
	
	
	public Student(String name, String id,String curse) {
		super(name, id);
		this.curse = curse;
		marksArray = new float[3];
	}


	public String getCurse() {
		return curse;
	}


	public void setCurse(String curse) {
		this.curse = curse;
	}


	public float[] getMarksArray() {
		return marksArray;
	}


	public void setMarksArray(float[] marksArray) {
		this.marksArray = marksArray;
	}

}
