package JavaSessions;

import java.util.ArrayList;

public class Company {

	String name;
	int empCount;
	
	public String getCEOName() {
		return "Asghar";
	}
	
	public int getTotalCount() {
		System.out.println("Get total count of shares...");
		int totalShare =  2000;
		
		return totalShare;
	}
	
	public String[] getCoFounders() {
		System.out.println("Get the names of coFounders");
		String founder[] = new String[3];
		founder[0] = "Asghar";
		founder[1] = "Meqdad";
		founder[2] = "Anwar";
		
		return founder;
	}
	
	public ArrayList<String> getCustomerList() {
		System.out.println("customer list");
		ArrayList<String> customerList = new ArrayList<String>();
		
		customerList.add("Fatima");
		customerList.add("Masoma");
		customerList.add("Dega Fatima");
		customerList.add("Kubra");
		
		return customerList;
	}
	
	
	
	
	
	
	
}
