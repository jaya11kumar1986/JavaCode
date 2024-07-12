package share;

public class SentenceReverse {

	public static void main(String[] args) {
		
		String a="i am tamilan";
		
		String[] words=a.split(" ");
		
		String rev="";
		
		for(int i=words.length-1;i>=0;i--) {
			
			rev=rev+words[i]+" ";
		}
		
		System.out.print(rev);
		
		

	}

}
