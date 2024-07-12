package test;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Jayakumar";
		
		String result="";
		
		for(int i=name.length()-1;i>=0;i--) {
			
			result=result+name.charAt(i);
		}
		
		System.out.println(result);

	}

}
