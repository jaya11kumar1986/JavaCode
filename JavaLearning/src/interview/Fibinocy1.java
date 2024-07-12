package interview;

public class Fibinocy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=5;
		int t1=0,t2=1;
		
		for(int i=0;i<num;i++) {
			
			System.out.print(t1+",");
			int sum=t1+t2;
			t1=t2;
			t2=sum;
		}

	}

}
