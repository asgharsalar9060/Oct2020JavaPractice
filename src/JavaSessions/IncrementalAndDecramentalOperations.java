package JavaSessions;

public class IncrementalAndDecramentalOperations {

	public static void main(String[] args) {

		System.out.println("post incrament");
		int i1 = 10;
		int i2 = i1++;
		
		System.out.println(i1);//11
		System.out.println(i2);//10
		
		System.out.println("pre incrament");
		int i3 = 10;
		int i4 = ++i3;
		
		System.out.println(i3);//11
		System.out.println(i4);//11
		
		System.out.println("post decrament");
		int i5 = 10;
		int i6 = i5--;
		
		System.out.println(i5);//9
		System.out.println(i6);//10
		
		System.out.println("pre decrament");
		int i7 = 10;
		int i8 = --i7;
		
		System.out.println(i7);//9
		System.out.println(i8);//9
		
		System.out.println("Double");
		double d1 = 100.99;
		
		System.out.println(d1++);
		System.out.println(d1);
		
		double d2 = 100.99;
		System.out.println(++d2);
		
		System.out.println("char");
		
		char c1 = 'a';
		char c2 = c1++;
		System.out.println(c1);//b
		System.out.println(c2);//a
		
		char c3 = 'a';
		
		System.out.println(++c3);
		
		
		
		
		
	}

}
