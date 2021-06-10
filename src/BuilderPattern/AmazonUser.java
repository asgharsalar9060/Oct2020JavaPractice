package BuilderPattern;

public class AmazonUser {

	public static void main(String[] args) {

		AmazonApp obj = new AmazonApp();

		obj.login("adming@gmail.com", "admin@123")
			.doSearch("Puma coat")
			.selectProduct("Puma coat")
			.addToCart("Puma coat")
			.doPayment("kalidalimali", "kali123")
			.getEmail()
			.logout();

		int orderId = obj.generateOrderId();

		System.out.println(orderId);
		
		System.out.println("******************");
		
		obj.login().getEmail().logout();

	}

}
