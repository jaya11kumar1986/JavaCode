package ConstructorDemo;

public class ConstructorOverLoading {

	int id;
	String name;
	double price;


	ConstructorOverLoading(){

		System.out.println("Constructor");
	}

	ConstructorOverLoading(int id,String name){
		this.id=id;
		this.name=name;


	}
	
	ConstructorOverLoading(double price,String name){
		this.price=price;
		this.name=name;


	}


	public static void main(String[] args) {
		
		ConstructorOverLoading s=new ConstructorOverLoading();
		
		System.out.println(s.id+"  default  "+s.name);
		
		ConstructorOverLoading s1=new ConstructorOverLoading(10,"Raj");

		System.out.println(s1.id+"  Para  "+s1.name);
		
		ConstructorOverLoading s2=new ConstructorOverLoading(10.5,"kumar");
		
		System.out.println(s2.price+"  chuma  "+s2.name);

	}

}
