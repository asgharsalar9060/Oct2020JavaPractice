package JavaSessions;

public class CallingMethodOverloadingInAnotherClass {

	public static void shopping() {
		System.out.println("default shopping");
	}

	public static void shopping(String un, String pwd) {
		System.out.println("shopping with: "+ un + " "+pwd);
	}

	public static void shopping(String name, long phone) {
		System.out.println("shopping with: "+ name + " " + phone);
	}

	public static void shopping(String name, int phone) {
		System.out.println("shopping with: "+name + " "+ phone);
	}
	
	public void shopping(double shopping) {
		System.out.println("shopping with bonus: "+ shopping);
	}
	
	
}
