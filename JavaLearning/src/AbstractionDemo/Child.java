package AbstractionDemo;

public class Child implements EmployeeDetails,Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child obj=new Child();
		obj.add();
		obj.mul();
		obj.minus();
		System.out.println(name);
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int a=10;
		int b=30;
		System.out.println(a+b);
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		int a=10;
		int b=30;
		System.out.println(a*b);
	}

	@Override
	public void minus() {
		// TODO Auto-generated method stub
		int a=10;
		int b=30;
		System.out.println(a-b);
	}

}
