package starPractice;

public class Star1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j,row=5;
		
		for( i=row-1;i>=0;i--) {
			
			for(j=0;j<=i;j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		

	}

}
