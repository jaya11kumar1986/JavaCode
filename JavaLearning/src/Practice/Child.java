package Practice;

public class Child extends Parent {
	
	public int get(Integer a) {
		
		return 20;
	}
	
	public static void main(String[] args) {
		
		Parent p=new Child();
		System.out.println(p.get(2));
	
	}

}
