package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {

		try {
			int in = 9 / 0;
		} catch (ArithmeticException d) {
			d.printStackTrace();
			System.out.println("exception is here");
		} finally {
			System.out.println("finally applied");
		}

		System.out.println("*******************************************");
		
		System.out.println(studentList("Dawewd"));

	}

//	public static int getMarks(String name) {
//		if(name.equals("Asghar")) {
//			try {
//			int i = 9/0;
//			return 100;
//			}catch(ArithmeticException e){
//				e.printStackTrace();
//				return 95;
//			}finally {
//				System.out.println("inside finally block");
//				//return 10;
//			}
//		}
//		else if(name.equals("Ali")) {
//			return 98;
//		}
//		else if(name.equals("Kalbi")){
//			return 87;
//		}
//		
//		return -1;
//	}

	public static int studentList(String list) {

		if (list.equals("Dawood")) {
			try {
				int in = 15 / 3;
				return 100;
			} catch (ArithmeticException f) {
				f.printStackTrace();
				return 90;
			}finally {
				//System.out.println("finally applied");
				//return 10;
			}
		} else if (list.equals("David")) {
			return 80;
		} else if (list.equals("Davweid")) {
			return 70;
		}
		return -2;
	}

}
