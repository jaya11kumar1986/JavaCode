package test;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,2,12,10,72,100,100,89};
		int x=a.length;
		int b[]=new int[x];
		
		for(int i=0;i<x;i++) {
			
			for(int j=i+1;j<x;j++) {
				
				if(a[i]==a[j]) {
					
					b[i]=a[i];
					
					//System.out.print(b[i]);
				}
				
				
			}
			if(b[i]!=a[i]) {
				System.out.print(a[i]+" ");
			}
		}

	}

}
