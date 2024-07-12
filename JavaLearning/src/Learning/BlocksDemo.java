package Learning;

public class BlocksDemo {


	static{

		System.out.println("static");
	}

	{

		System.out.println("IIB");
	}

	BlocksDemo(){

		System.out.println("Constructor");
	}
	
	BlocksDemo(String name){
		
		System.out.println(name);
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {

		System.out.println("Main");
		
		//BlocksDemo a=BlocksDemo.class.newInstance();
		
		BlocksDemo b=new BlocksDemo("Raj");
		BlocksDemo c=new BlocksDemo();
	}

}
