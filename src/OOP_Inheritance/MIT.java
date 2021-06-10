package OOP_Inheritance;

public class MIT extends UniAssociation{
	
	int stipend = 1200;

	public void compSci() {
		System.out.println("MIT -- computer science");
	}
	
	public void civilEng() {
		System.out.println("MIT -- civil engineering"); 
	}
	
	@Override
	public void scholarshipProgram() {
		System.out.println("MIT -- scholarship");
	}
	
	@Override
	public void educationSystem() {
		System.out.println("MIT -- education system");
	}
	
	
	
}
