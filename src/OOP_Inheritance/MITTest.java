package OOP_Inheritance;

public class MITTest {

	public static void main(String[] args) {

		MIT obj = new MIT();
		
		obj.compSci();
		obj.civilEng();
		obj.scholarshipProgram();
		obj.educationSystem();
		System.out.println("MIT -- " + obj.stipend);
		
		obj.studentExchangeProgram();
		obj.educationStandard();
		
		UniAssociation.Olympiad();
		
		obj.policyMaking();
		obj.policyMaking("Modern teaching style");
		obj.policyMaking(123000434, 459870874);
		obj.policyMaking("different shifts", "standard");
		
	}

}
