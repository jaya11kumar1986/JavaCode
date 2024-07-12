package test;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="amma";

		String result="";

		for(int i=name.length()-1;i>=0;i--) 

			result=result+name.charAt(i);

		if(result.equals(name)) 

			System.out.println("Palindrome");

		else
			System.out.println("Not Palindrome");
	}

}
