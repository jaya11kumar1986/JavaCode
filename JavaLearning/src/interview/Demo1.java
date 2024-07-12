package interview;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input="Sun set in west";

		String []word=input.split("\\s");

		String output="";

		for(int i=word.length-1;i>=0;i--) {

			output=output+word[i]+" ";
		}
		System.out.println(output);
	}

}
