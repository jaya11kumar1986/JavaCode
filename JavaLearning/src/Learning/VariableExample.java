package Learning;

public class VariableExample {
	
	String name1="elavenil";//instance variable need a object
	
	static String name2="Sri";// static variable no need a method

	public static void main(String[] args) {
		
		VariableExample vs=new VariableExample();
		
		String name="Tamil";//Local variable
		
		System.out.println(name);
		
		System.out.println(vs.name1);
		
		System.out.println(name2);

	}

}
