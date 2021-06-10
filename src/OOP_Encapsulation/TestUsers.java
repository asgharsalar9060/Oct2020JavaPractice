package OOP_Encapsulation;

public class TestUsers {

	public static void main(String[] args) {

		//direct calling
		Users usr1 = new Users();
		usr1.name = "Ali";
		System.out.println(usr1.name);
		
		usr1.age = 43;
		System.out.println(usr1.age);
		
		//calling through const...
		Users usr2 = new Users();
		usr2.name = "Kali";
		System.out.println(usr2.name);
		
		usr2.age = 45;
		System.out.println(usr2.age);
		
		//calling through getters and setters	
		Users usr3 = new Users();
		usr3.setName("Mali");
		usr3.setAge(56);
		System.out.println(usr3.getName() + " " + usr3.getAge() + " " + Users.getCompany());
		
	}

}
