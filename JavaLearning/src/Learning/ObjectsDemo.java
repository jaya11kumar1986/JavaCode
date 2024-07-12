package Learning;

public class ObjectsDemo {
	
	
	public void add() {
		
		System.out.println("Added");
	}
	
	String name="Ram";

	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		//Using new keyword
		ObjectsDemo obj=new ObjectsDemo();
		obj.add();
		
		//Using new instance
//		ObjectsDemo obj1=ObjectsDemo.class.newInstance();
//		obj1.add();
		
		ObjectsDemo obj2=(ObjectsDemo)obj.clone();
		System.out.println(obj2.name);
	}

}
