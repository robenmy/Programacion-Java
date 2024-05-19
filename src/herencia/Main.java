package herencia;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Person> persons = new ArrayList<Person>();
	
		
		Student std = new Student("Juan", "01", "P1");
		Teacher tea = new Teacher("Jose", "01", "ISC", 100, "B");
		Admin ad = new Admin("Pepe", "01", "ISC", 200, "8am-5pm");
		
		persons.add(std);
		persons.add(tea);
		persons.add(ad);
	    

		/*for (Person aux : persons) {
			if(aux instanceof Worker){
			System.out.println("Salario: "+ ((Worker)aux).getSalary());
			}else{
				System.out.println("los Estudiantes no tienen");	
			}
		}*/
		
		System.out.println("\n\n");
		
		for (Person aux : persons) {
			if(aux instanceof Worker){
				((Worker) aux).incSalary(5000);
			System.out.println("Salario: "+ ((Worker)aux).getSalary());
			}
			else if(aux instanceof Student){
				System.out.println("Los estudiantes no tienen");	
			}
		}

	}

}
