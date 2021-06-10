package JavaSessions;

import java.util.ArrayList;

public class CompanyTest {

	public static void main(String[] args) {

		Company comp = new Company();
		String str1 = comp.getCEOName();
		System.out.println(str1);
		
		int nt1 = comp.getTotalCount();
		System.out.println(nt1);
		
		String str2[] = comp.getCoFounders();
		System.out.println(str2.length);
		
		for(String e : str2) {
			System.out.println(e);
		}
		
		ArrayList<String> str3 = comp.getCustomerList();
		System.out.println(str3.size());
		
//		for(int nt2=0; nt2<str3.size(); nt2++) {
//			System.out.println(str3[nt2]);
//		}
		
		for(String e2 : str3) {
			System.out.println(e2);
		}
	}

}
