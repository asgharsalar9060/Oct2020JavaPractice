package ExceptionHandling;

public class TryCatchBlock {
	
	String name;

	public static void main(String[] args) {

		int base = 9;
		System.out.println("Hi");
		System.out.println("Hi");
		
		try {
		TryCatchBlock obj = new TryCatchBlock();
		
		//obj = null;
		
		obj.name = "Ali";
		System.out.println(obj.name);
		
		int i = base/0;
		
		System.out.println("Hey");
		System.out.println("Hey");
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception is coming");
			e.printStackTrace();
		}catch(NullPointerException n) {
			System.out.println("Null Pointe rException is coming");
			n.printStackTrace();
		}
		
		System.out.println("Bye");
		System.out.println("Bye");
	}

}
