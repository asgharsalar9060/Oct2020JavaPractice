package JavaSessions;

public class CallingMethodOverloadingInAnotherClassTest {

	public static void main(String[] args) {
		
		CallingMethodOverloadingInAnotherClass.shopping();
		CallingMethodOverloadingInAnotherClass.shopping("admin", "admin");
		
		CallingMethodOverloadingInAnotherClass mo = new CallingMethodOverloadingInAnotherClass();
		mo.shopping(12.11);
		
		
		
	}

}
