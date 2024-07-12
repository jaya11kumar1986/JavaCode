package test;

public class DuplicateRemoveOtherPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={10,1,10,100,98,99,72,88,100};

		int x=a.length;

		int b[]=new int[x];

		for(int i=0;i<x;i++)
		{

		for(int j=i+1;j<x;j++)
		{

		if(a[i]==a[j])
		{

		b[i]=a[i];

		System.out.print(b[i]+" ");

		}
		}

		if(b[i]!=a[i]){
		  //System.out.print(a[i]+" ");
		   
		}


		}
	}

}
