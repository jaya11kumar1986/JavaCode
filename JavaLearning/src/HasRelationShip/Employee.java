package HasRelationShip;

public class Employee {


	int id;
	String name;
	Address address;
	Employee(int id,String name, Address address){

		this.id=id;
		this.name=name;
		this.address=address;
	}

	void display() {
		System.out.println(id+"  "+name);
		System.out.println(address.dis+" "+address.state+" "+address.country);
	}
	public static void main(String[] args) {

		Address address=new Address("Madurai","TN","India");
		Address address1=new Address("Theni","BA","India");

		Employee em=new Employee(1,"Tamil",address);
		Employee em1=new Employee(2,"Jai", address1);
		
		em.display();
		em1.display();


	}

}
