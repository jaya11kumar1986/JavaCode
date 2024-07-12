package GuessTheOutput;

public class Demo1 {
	
	int x=m1();
	
	int m1() {
		System.out.println("int m1");
		return 10;
	}
	
	Demo1(){
		
		System.out.println("Constructor");
	}
	public static void main(String[] args) {
		
		new Demo1();
		

	}

}
