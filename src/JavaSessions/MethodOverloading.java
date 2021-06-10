package JavaSessions;

public class MethodOverloading {

	public static void main(String[] args) {

		shopping();
		shopping("salar@gmail.com", "salar123");
		shopping("Asghar Salar", 803300234);
		shopping("Anwar Salar", 978934343);
		
		MethodOverloading sh = new MethodOverloading();
		sh.shopping(12.11);
	}

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
