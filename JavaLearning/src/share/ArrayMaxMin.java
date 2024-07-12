package share;

public class ArrayMaxMin {

	public static void main(String[] args) {
		
		int []a= {2,5,8,7,6,1,9};
		
		int max=a[0];
		int min=a[0];
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>max) {
				
				max=a[i];
			}
			
			if(a[i]<min) {
				min=a[i];
			}
		}
		
		System.out.println("Max:"+max);
		System.out.println("Min:"+min);

	}

}
