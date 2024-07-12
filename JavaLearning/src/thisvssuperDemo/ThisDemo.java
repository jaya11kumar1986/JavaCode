package thisvssuperDemo;

public class ThisDemo {

	int age=10;
	ThisDemo(int age){
	
		this.age=age;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisDemo a=new ThisDemo(20);
		System.out.println(a.age);

	}

}