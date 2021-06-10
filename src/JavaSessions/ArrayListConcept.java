package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		ArrayList al1 = new ArrayList();

		System.out.println(al1.size());

		al1.add(100);
		al1.add(200);
		al1.add(300);

		System.out.println(al1.size());

		for (int i = 0; i < al1.size(); i++) {
			System.out.println(al1.get(i));
		}

		for (Object e : al1) {
			System.out.println(e);
		}

		ArrayList<String> al2 = new ArrayList<String>();

		al2.add("Automation");
		al2.add("Testing");

		int nt = al2.size();
		System.out.println(nt);

		for (int i2 = 0; i2 < al2.size(); i2++) {
			System.out.println(al2.get(i2));
		}

		ArrayList al3 = new ArrayList();

		al3.add("A");
		al3.add("B");
		al3.add("C");
		al3.add("D");

		int nt2 = al3.size();
		System.out.println(nt2);

		al3.clear();

		int nt3 = al3.size();
		System.out.println(nt3);

		ArrayList al4 = new ArrayList();

		al4.add("A");
		al4.add("B");
		al4.add("C");
		al4.add("D");

		System.out.println(al4);
		
		ArrayList<String> al5 = (ArrayList<String>)al4.clone();
		
		System.out.println(al5);
		
		System.out.println(al4.contains("A"));
		System.out.println(al5.contains("A"));
		
		System.out.println(al4.contains("Z"));
		
				
		
	}

}
