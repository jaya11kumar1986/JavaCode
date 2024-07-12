package interfaceDemo;

public class C implements A,B {

	public static void main(String[] args) {
		
		C c=new C();
		
		c.defaultMethod();


	}

	@Override
	public void defaultMethod() {
		// TODO Auto-generated method stub
		A.super.defaultMethod();
	}



}
