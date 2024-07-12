package interview;

public class Day1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="TamilSelvan";

		String result="";

		for(int i=a.length()-1;i>=0;i--) {

			result=result+a.charAt(i);
		}
		System.out.println(result);
	}

}
