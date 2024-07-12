package share;

public class ArrayDuplicate {

	public static void main(String[] args) {
		
		int a[]= {10,20,50,10,20,60,74,45};
		
		int x=a.length;
		
		int b[]=new int [x];
		
		for(int i=0;i<x;i++) {
			
			for(int j=i+1;j<x;j++) {
				
				if(a[i]==a[j]) {
					
					//System.out.println(a[i]);
					b[i]=a[i];
				}
			}
			
			if(b[i]!=a[i]) {
				System.out.print(a[i]+" ");
			}
		}

	}

}
