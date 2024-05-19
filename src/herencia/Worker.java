package herencia;

public abstract class Worker extends Person {

	private String dep;
	protected float salary;
	
	public Worker(String name, String id,String dep, float salary) {
		super(name, id);
		this.dep = dep;
		this.salary = salary;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public abstract void incSalary(float amount);
	
	}