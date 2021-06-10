package OOP_Interface;

public interface UniAssociation extends MinistryOfHigherEducation {

	public void management();
	
	public static void scholarship() {
		System.out.println("UniAssociation -- UniAssociation");
	}
	
	public default void finance() {
		System.out.println("UniAssociation -- finance department");
	}
}
