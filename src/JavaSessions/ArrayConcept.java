package JavaSessions;

import java.lang.reflect.Array;

public class ArrayConcept {

	public static void main(String[] args) {

		String s1[] = {"automation", "testing", "engineer"};
		
		System.out.println(s1.length);
		
		System.out.println(s1[0]);
		
		for(int i = 0; i<s1.length; i++) {
			System.out.println(s1[i]);
		}
		
		int i1[][] = {{10, 20, 30, 40, 50}, {60, 70, 80, 90}};
		
		System.out.println(i1.length);
		
		System.out.println(i1[0][4]);
		
		System.out.println(i1[1][0]);
		
		for(int i2=0; i2<i1.length; i2++) {
			for(int i3=0; i3<i1[1].length; i3++) {
				System.out.println(i1[i2][i3]);
			}
		}
		
		String s2 [][] = {{"Viginia", "California", "Goergia"}, {"Texas", "Kanzas", "New York"}};
		s2[0][1] = "Alaska";
		
		System.out.println(s2.length);
		
		System.out.println(s2[1][2]);
		
		for(int i4=0; i4<s2.length; i4++) {
			for(int i5=0; i5<s2[i4].length; i5++) {
				System.out.println(s2[i4][i5]);
			}
		}
		
		
		
		
		
		
	}

}
