package herencia;

public class Admin extends Worker {

	private String schedule;
	
	public Admin(String name, String id, String dep, float salary,String schedule) {
		super(name, id, dep, salary);
		this.schedule = schedule;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	@Override
	public void incSalary(float amount) {
		salary += amount; 
		
	}

	
	
	
	

}
