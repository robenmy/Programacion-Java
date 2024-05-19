package herencia;

public class Teacher extends Worker {

	private String category;
	
	public Teacher(String name, String id, String dep, float salary,String category) {
		super(name, id, dep, salary);
		this.category = category;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public void incSalary(float amount) {
		switch (category) {
		case "A":
			salary = (float) (salary*1.05);
			break;
        case "B":
        	salary = (float) (salary*1.03);
			break;
        case "C":
        	salary = (float) (salary*1.02);
			break;	
		}
		
	}

	

	
	

}
