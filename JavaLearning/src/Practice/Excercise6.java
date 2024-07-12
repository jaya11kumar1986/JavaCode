package Practice;

public class Excercise6 {
	
	public static void main(String[] args) {

		int arr1[]={10,'a','v',4,6,7,'B',6,'Z'};
								
		
        for(int i:arr1)
        {	
           if((i>=65 && i<=90)||(i>=97 && i<=122))
            { 	
                System.out.println((char)i + " " + i );      	

            }  
        }
		
//		for(int i:arr1) {
//			
//			System.out.println(i);
//		}


}
}



