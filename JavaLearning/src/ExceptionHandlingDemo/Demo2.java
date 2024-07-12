package ExceptionHandlingDemo;

public class Demo2 {

	public static void main(String[] args) throws Exception {
		
		int age=15;
		
		if(age>10) {
			
			throw new Exception("Age is not correct");
		}
		
		if(age<10) {
			
			System.out.println("Your age is correct");
		}

	}

}
