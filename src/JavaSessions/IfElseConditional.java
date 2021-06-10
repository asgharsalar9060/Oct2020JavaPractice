package JavaSessions;

public class IfElseConditional {

	public static void main(String[] args) {

		int i1 = 10;
		int i2 = 20;
		
		if(i1 > i2) {
			System.out.println("i1 is bigger than i2");
		}
		else {
			System.out.println("i1 is smaller than i2");
		}
		
		int i3 = 100;
		int i4 = 150;
		
		if(i3==i4) {
			System.out.println("Hi");
		}
		else {
			System.out.println("bye");
		}
		
		//dead code
		
		if(true) {
			System.out.println("Automation");
		}
		else {
			System.out.println("Manual");
		}
		
		String s1 = "Automation";
		String s2 = "automation";
		
		if(s1.equals(s2)) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("Both are not equal");
		}
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Both are equal");
		}
		else {
			System.out.println("both are not equal");
		}
		
		//Nested if
		
		int marks = 97;
		
		if(marks>=90) {
			System.out.println("A grade");
			if(marks>=80) {
					System.out.println("B grade");
					if(marks>=70) {
							System.out.println("C grade");
							if(marks>=60) {
									System.out.println("D grade");
					}
				}
			}
		}
		
		else {
			System.out.println("F grade");
		}
		
		String browser = "ie";
		
		if(browser.equals("chrome")) {
			System.out.println("launch chrome");
		}
		if(browser.equals("firefox")) {
			System.out.println("launch firefox");
		}
		if (browser.equals("safari")){
			System.out.println("launch safari");
		}
		
		//else if
		
		if(browser.equals("chrome")) {
			System.out.println("chrome launch");
		}
		else if(browser.equals("firefox")) {
			System.out.println("firefox launch");
		}
		else if(browser.equals("safari")) {
			System.out.println("safari launch");
		}
		else {
			System.out.println("please pass the correct browser");
		}
		
		//FOR INTERVIEW
		
		int i5 = 100;
		int i6 = 200;
		int i7 = 300;
		
		if(i5>i6 && i5>i7) {
			System.out.println("i5 is the biggest number");
		}
		else if(i6>i7) {
			System.out.println("i6 is the biggest number");
		}
		else {
			System.out.println("i7 is the biggest number");
		}
		
		if(i5<i6 && i5<i7) {
			System.out.println("i5 is the smallest number");
		}
		else if(i6<i7) {
			System.out.println("i6 is the smallest number");
		}
		else {
			System.out.println("i7 is the smallest number");
		}
		
		
		
		
	}

}
