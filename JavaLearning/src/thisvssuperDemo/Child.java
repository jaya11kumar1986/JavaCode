package thisvssuperDemo;

public class Child extends Parent {
	
	String name="Child";
	int a=15;
	int b=20;
	
	public  void display() {
		
		System.out.println(name);//child
		System.out.println(this.name);//child
		System.out.println(super.name);//parent
		System.out.println(this.a+b);//child
		System.out.println(super.a+b);//parent
		
	}

	public static void main(String[] args) {
		
		Child c=new Child();
		
		c.display();
		

	}

}
