package OOP_Encapsulation;

public class Users {

	public String name;
	public int age;
	
	public static String company = "IBM";
	
	public Users() {
		
	}
	

	public Users(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static String getCompany() {
		return company;
	}

	public static void setCompany(String company) {
		Users.company = company;
	}
	
	
	
	
	
	
	
}
