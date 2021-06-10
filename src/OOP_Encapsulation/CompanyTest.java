package OOP_Encapsulation;

public class CompanyTest {

	public static void main(String[] args) {

		Company comp = new Company("SALAR.LTD", 10000, 1000, "300 Yoakum PKWAY", "ASGHAR, ANWAR, MEQDAD", "GODFATHER");
		
		System.out.println("Company: " + comp.name + " "+comp.address + " "+comp.ceo );
		
		
	}

}
