package OOP_Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee em = new Employee();
		
		em.setName("Asghar");
		System.out.println(em.getName());
		
		em.setAge(78);
		System.out.println(em.getAge());
		
		em.setSalary(10000);
		System.out.println(em.getSalary());
		
		em.setAddress("300 YOAKUM PKWY");
		System.out.println(em.getAddress());
		
		
		
	}

}
