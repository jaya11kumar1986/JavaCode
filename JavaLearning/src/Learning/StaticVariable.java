package Learning;

public class StaticVariable {
	
	int rollno;
	String name;
	static String college="KLN";
	
	StaticVariable(int r,String n){
		
		 rollno=r;
		 name=n;
	}
	
	void display() {
		
		System.out.println(rollno+" "+name+" "+college);
	}
	

	public static void main(String[] args) {
		
		StaticVariable sv=new StaticVariable(1,"Tamil");
		StaticVariable sv1=new StaticVariable(2,"Kumar");
		
		sv.display();
		sv1.display();
	
		
		
		

	}

}
