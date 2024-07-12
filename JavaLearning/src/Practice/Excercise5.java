package Practice;

public class Excercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s=Welcome.class.getSimpleName();
		System.out.println(s);
		
		//String d=Excercise1.class.getSimpleName();
		//String d=Excercise1.class.getName();
		//String d=Excercise1.class.getPackageName();
		//String d=Excercise1.class.getCanonicalName();
		//String d=Excercise1.class.getTypeName();
		Class<? extends Class> d=Excercise1.class.getClass();
		System.out.println(d);

	}

}
