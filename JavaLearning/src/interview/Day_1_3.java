package interview;

public class Day_1_3 {

	public static String sentence(String input){

		String word[]=input.split("\\s");

		String output="";

		for(int i=word.length-1;i>=0;i--){

			output=output+word[i]+" ";

		}

		return output;

	}

	public static void main(String[] args) {
		String input="Sun set in west";
		//String input="ABC DEF GHI";
		String output=sentence(input);

		System.out.print(output);

	}

}
