package inheritanceDemo;

public class Test {

	public static void main(String[] args) {
	
	//Case 1	//A a=new A(); //Parent class method only invoked
		//a.m1();
		
		/*
		//Case 2	 * B b=new B(); b.m1(); b.m2(); //Parent and child class method invoked
		 */
		
		//Case 3	A a=new B();//Parent class method only invoked
		//a.m1();
		
	//case 4	A b=new A(); //compile time eroor occured
		
		

	}

}
