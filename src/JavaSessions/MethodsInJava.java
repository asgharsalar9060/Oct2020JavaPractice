package JavaSessions;

public class MethodsInJava {

	public static void main(String[] args) {

		MethodsInJava obj =  new MethodsInJava();
		
		obj.test();
		
		int i2 = obj.getMarks();
		System.out.println(i2);
		
		String s2 = obj.getName();
		System.out.println(s2);
		
		int i3 = obj.sum(10, 11);
		System.out.println(i3);
		
	}
	
	public void test() {
		System.out.println("test method");
	}
	
	public int getMarks() {
		System.out.println("get marks method");
		int total = 100;
		int bonus = 90;
		int i = total+bonus;
		return i;
	}
	
	public String getName() {
		System.out.println("get name method");
		String s1 = "Asghar";
		return s1;
	}
	
	public int sum(int a, int b) {
		System.out.println("sum method");
		int in = a+b;
		return in;
	}

}
