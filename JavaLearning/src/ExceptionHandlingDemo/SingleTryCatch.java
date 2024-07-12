package ExceptionHandlingDemo;

public class SingleTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a=0;
			int b=3;
			int c=b/a;
			
			System.out.println(c);
			
		}
		
		catch (ArithmeticException e) {
			System.out.println("Number doesn't divided by 0");
		}
		catch(Exception e){
			
			e.printStackTrace();
		}

	}

}
