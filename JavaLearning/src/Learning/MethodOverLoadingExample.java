package Learning;

public class MethodOverLoadingExample {
	
	
	
	public void add(int a,int b) {
		
		int c=a+b;
		System.out.println(c);
	}
	
	public void add(int a,int b,int c) {
		
		int d=a+b-c;
		System.out.println(d);
	}

	public static void main(String[] args) {
		
		MethodOverLoadingExample s=new MethodOverLoadingExample();
		s.add(10, 5,3);
		
		
		

	}

}
