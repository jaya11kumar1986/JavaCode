package interview;

import java.util.Scanner;

public class oddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int next = sc.nextInt();
		
		if(next%2==0) {
			System.out.println("Even  Number");
		}
		
		else {
			System.out.println("Odd Number");
		}
		
		
		

	}

}
