package test;

public class SecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,40,50,12,100,20};

		int max=a[0];

		int smax=a[0];

		for(int i=0;i<a.length;i++) {

			if(a[i]>max) {
				smax=max;
				max=a[i];
			}

			else if(a[i]>smax) {
				smax=a[i];

			}
		}
		System.out.println(smax);
	}

}
