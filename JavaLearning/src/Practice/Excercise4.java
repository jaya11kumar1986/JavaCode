package Practice;

public class Excercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="hello";
		String s2=new String(s1);
		System.out.println(s1==s2);
		System.out.println(s1.equalsIgnoreCase(s2));
		
		boolean res=(s1==s2.intern());
		System.out.println(res);

	}

}
