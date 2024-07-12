package AbstractionDemo;

public class B extends A implements EmployeeDetails {

	public static void main(String[] args) {

		A a=new B();
		a.show();
		a.show1();
		a.show2();
		
		B b=new B();
		b.add();
		b.mul();
		

	}

	@Override
	void show() {
		int a=10;
		int b=20;
		System.out.println(a+b);

	}

	@Override
	void show1() {

		int a=100;
		int b=20;
		System.out.println(a*b);
	}

	@Override
	public  void add() {
		int a=78;
		int b=12;
		System.out.println(a+b);
		
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		int a=79;
		int b=12;
		System.out.println(a*b);
	}

}
