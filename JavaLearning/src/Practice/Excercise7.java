package Practice;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

class Excercise7 {

	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter pw=new PrintWriter("abc.txt");
		pw.println("Hello");
		pw.append("Small");
		//System.out.println(10/0);
		

	}
}
