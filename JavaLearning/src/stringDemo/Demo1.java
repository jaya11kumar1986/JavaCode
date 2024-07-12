package stringDemo;

public class Demo1 {

	public static void main(String[] args) {
		
		String name="Jayakumar";//literal
		
		String name2="Jayakumar";//literal
		
		System.out.println(name==name2);
		
		int num=3;
		
		System.out.println(Integer.toString(num));
		
		System.out.println(name.toString());
		
		System.out.println(name.equals(name2));
		System.out.println("-------------------------------------------");
		String name1=new String("Tamil");
		String name3=new String("Tamil");
		
		System.out.println(name1==name3);
		
		System.out.println(name1.equals(name3));
		System.out.println("-------------------------------------------");
		name.charAt(0);
		
		System.out.println(name.charAt(0));
		System.out.println(name.length());
		System.out.println(name.lastIndexOf(name3));
		System.out.println(name.substring(7));
		System.out.println(name.concat(name3));
		
		System.out.println(String.join("/", "30","4","2025"));
		
		String split="i,am,jayakumar";
		
		String s[]=split.split(",");
		
		for(String a:s) {
			
			System.out.println(a);
		}
		
	

	} 

}
