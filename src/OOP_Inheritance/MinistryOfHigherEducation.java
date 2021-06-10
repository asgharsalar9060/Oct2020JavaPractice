package OOP_Inheritance;

public class MinistryOfHigherEducation {

	public void educationSystem() {
		System.out.println("MinistryOfHigherEducation -- education system");
	}

	public void educationStandard() {
		System.out.println("educationStandard -- education standard");
	}

	//method overloading
	
	public void policyMaking() {
		System.out.println("policyMaking -- default policy");
	}

	public void policyMaking(String methods) {
		System.out.println("policyMaking -- teaching methods " + methods);
	}

	public void policyMaking(String schedule, String curruculum) {
		System.out.println("policyMaking -- schedule " + schedule + " curruculum " + curruculum);
	}

	public void policyMaking(int teacherCount, int studentCount) {
		System.out.println("policyMaking -- teacherCount " + teacherCount + " studentCount " + studentCount);
	}

	public void policyMaking(int salary, String benefits) {
		System.out.println("policyMaking -- salary and benefits " + salary + " " + benefits);
	}

}
