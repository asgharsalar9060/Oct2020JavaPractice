package OOP_Interface;

public class MIT extends MIT_Departments implements US_MIT, UK_MIT, UEA_MIT{

	@Override
	public void petroleumEngineering() {
		System.out.println("MIT -- petroleumEngineering");
	}

	@Override
	public void chemicalEngineering() {
		System.out.println("MIT -- chemicalEngineering");
	}

	@Override
	public void biomedicalEngineering() {
		System.out.println("MIT -- chemicalEngineering");
		
	}

	@Override
	public void civilEng() {
		System.out.println("MIT -- civilEng");
		
	}

	@Override
	public void electricalEng() {
		System.out.println("MIT -- electricalEng");
		
	}

	@Override
	public void compSci() {
		System.out.println("MIT -- compSci");
		
	}

	@Override
	public void dataSci() {
		System.out.println("MIT -- dataSci");
		
	}
	
	public void science() {
		System.out.println("MIT -- science");
	}
	
	public void technology() {
		System.out.println("MIT -- technology");
	}

	@Override
	public void management() {
		System.out.println("MIT -- management");
		
	}

	@Override
	public void policyMaking() {
		System.out.println("MIT -- policy making");
	}

}
