package Learning;

public class Child extends Parent {

void display() {
		
		System.out.println("Child");
	}
	public static void main(String[] args) {
		//upcasting
		Parent parent=new Child();
		parent.display();
		
		Child child=(Child)parent;
		child.display();

	}

}
