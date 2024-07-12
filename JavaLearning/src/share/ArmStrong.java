package share;

public class ArmStrong {

	public static void main(String[] args) {
		
		int num=154;
		int arm=0;
		int rem;
		int num2=num;
		
		do {
			
			rem=num%10;
			arm=arm+(rem*rem*rem);
			num=num/10;
		}while(num>0);
		
		if(num2==arm)
			System.out.println("ArmStrong");
		else
			System.out.println("No");

	}

}
