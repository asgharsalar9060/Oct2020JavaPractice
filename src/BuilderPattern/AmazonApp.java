package BuilderPattern;

public class AmazonApp {

	public AmazonApp login() {
		System.out.println("default login");
		return this;
	}

	public AmazonApp login(String un, String pwd) {
		System.out.println("login with username and password " + un + " " + pwd);
		return this;
	}

	public AmazonApp doSearch(String productName) {
		System.out.println("search products " + productName);
		return this;
	}

	public AmazonApp doSearch(String productName, int price) {
		System.out.println("search products with name and price " + productName + " " + price);
		return this;
	}

	public AmazonApp selectProduct(String productName) {
		System.out.println("select product by name " + productName);
		return this;
	}

	public AmazonApp addToCart(String productName) {
		System.out.println("add to cart product " + productName);
		return this;
	}

	public AmazonApp doPayment(String accountName, String pwd) {
		System.out.println("do pay for product " + accountName + " " + pwd);
		return this;
	}

	public int generateOrderId() {
		return 12000;
	}

	public AmazonApp getEmail() {
		System.out.println("get purchase confirmation email");
		return this;
	}

	public AmazonApp logout() {
		System.out.println("logout");
		return this;
	}

}
