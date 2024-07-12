package share;

public class EachCharacter {

	public static void main(String[] args) {

		String a="i am tamilan";

		String[] words=a.split(" ");

		String rev="";
		
		for(String word:words) {
			
			String output="";
			
			for(int i=word.length()-1;i>=0;i--) {
				
				output=output+word.charAt(i);
			}
			
			rev=rev+output+" ";
		}
		
		System.out.print(rev);

	}

}
