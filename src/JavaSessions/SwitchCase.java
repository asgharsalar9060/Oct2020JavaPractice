package JavaSessions;

public class SwitchCase {

	public static void main(String[] args) {

		String browser = "ie";
		
		switch (browser) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "opera":
			System.out.println("launch opera");
			break;
		default:
			System.out.println("please pass the correct browser " + browser);
			break;
		}
		
		int marks = 80;
		int discount = 0;
		
		switch (marks) {
		case 100:
			System.out.println("A grade");
			discount = 1000;
			break;
		case 90:
			System.out.println("B grade");
			discount = 500;
			break;
		case 80:
			System.out.println("C grade");
			discount = 250;
			break;

		default:
			System.out.println("Fail");
			break;
		}
		
		System.out.println("Your grade is: "+marks + " and Your discount: "+discount);
		
		
	}

}
