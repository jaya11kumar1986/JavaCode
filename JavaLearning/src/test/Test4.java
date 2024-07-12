package test;

public class Test4 {

	public static void main(String[] args) {
		
		int a[]={1,2,2,3,4,4,5,5,6,7};
		
		int x=a.length;
		
		int b[]=new int[x];
		
		for(int i=0;i<x;i++) {
			
			for(int j=i+1;j<x;j++) {
				
				if(a[i]==a[j]) {
					
					b[i]=a[i];
					System.out.println(b[i]);
				}
			}
		
		}
		

	}

}
