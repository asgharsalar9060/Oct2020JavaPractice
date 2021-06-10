package OOP_Encapsulation;

public class WebDriver {

	public void launchBrowser(String browser) {
		if(browser.equals("chrome")) {
			launchChrome();
		}
		else if(browser.equals("firefox")) {
			launchFirefox();
		}
		else {
			System.out.println("Please pass the correct browser "+ browser);
		}
	}
	
	private void launchChrome() {
		System.out.println("OS version");
		System.out.println("browser version");
	}
	
	private void launchFirefox() {
		System.out.println("Windows version");
		System.out.println("launch forefox");
	}
	
}
