package starPractice;

public class ClassTwo {

	public static void main(String[] args) {
		
		int num=7;
		
		for(int i=1;i<=num;i++) {
			
			for(int j=i;j<=num;j++) 
				
				System.out.print(" ");
				
				for(int k=1;k<(i*2);k++) 
					
					System.out.print("*");
				
				System.out.println();
			}
		}

	}


