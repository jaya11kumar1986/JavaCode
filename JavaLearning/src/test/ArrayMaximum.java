package test;

public class ArrayMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,40,50,12,100,20};

		int max=a[0];

		for(int i=0;i<a.length;i++) {



			if(a[i]>max) {

				max=a[i];

			}

		}
		System.out.println(max);
	}

}
