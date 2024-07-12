package ConstructorDemo;

public class A {
	
	A(){
		
		System.out.println("Constructor");
	}
	
	{
		System.out.println("IIB");	
		
	}
	
	static {
		
		System.out.println("SIB");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a=new A();

	}

}
