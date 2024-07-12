package stringDemo;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer s=new StringBuffer("String");

		System.out.println(s.append("Jai"));
		System.out.println(s);
		
		String a="jai";
		System.out.println(a.concat("t"));
		System.out.println(a);
	}

}
