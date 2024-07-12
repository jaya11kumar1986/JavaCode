package Learning;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		
		double b=a;//Widening casting
		
		double c=20.0;
		int d=(int) c;
		
		double e=30.0;
		float f=(float) e;//Narrowing casting
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(c);
		System.out.println(d);
		
		System.out.println(e);
		System.out.println(f);

	}

}
