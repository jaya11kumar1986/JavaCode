package interview;

public class Parlidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="amma";

		String result="";

		for(int i=name.length()-1;i>=0;i--) 

			result=result+name.charAt(i);
			
			if(name.equals(result)) 
				System.out.println(name+"   It is palidrome");
				
			
			
			else
				System.out.println(name+"It is not palidrome");
			
		
		
	}

}
