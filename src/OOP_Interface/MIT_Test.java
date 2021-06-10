package OOP_Interface;

public class MIT_Test {

	public static void main(String[] args) {

		MIT obj = new MIT();
		
		obj.civilEng();
		obj.compSci();
		obj.dataSci();
		obj.chemicalEngineering();
		obj.technology();
		System.out.println(UEA_MIT.studentNum);
		
		obj.management();
		
		obj.departmentsNum(34);
		
		obj.policyMaking();
		
		//top casting
		
		US_MIT obj2 = new MIT();
		
		obj2.compSci();
		obj2.dataSci();
		
		
		
		
		
		
	}

}
