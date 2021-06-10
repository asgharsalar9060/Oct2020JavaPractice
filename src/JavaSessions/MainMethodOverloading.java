package JavaSessions;

public class MainMethodOverloading {

	public static void main(String a[]) {

		
		System.out.println("Hello world");
		
		main(10);
		main(10, 10);
		main(10, " bananas");
		
		
		
		
	}
	
	public static void main(int a) {
		System.out.println(a);
	}
	
	public static void main(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void main(int a, String b) {
		System.out.println(a+b);
	}

}
