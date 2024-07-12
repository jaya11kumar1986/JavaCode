package PracticeOne;

public class AlphabetAndNumeric {

	public static void main(String[] args) {
		
		String input="a0U1T2O3M4A5T6I7O8N9";
		
		String letter="";
		String number="";
		
		for(int i=0;i<input.length();i++) {
			
			if(Character.isLetter(input.charAt(i))) {
				letter=letter+input.charAt(i);
				
			}
			
			else {
				
				number=number+input.charAt(i);
				
			}
		}
		
		System.out.println(letter+" ");
		System.out.println(number+" ");

	}

}
