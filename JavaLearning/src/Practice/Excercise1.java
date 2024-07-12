package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Excercise1 {

	public static void main(String[] args) {
		
		String x="jayakumar";

		char y[]=x.toCharArray();

		List<Character> list=new ArrayList<Character>();

		for(int i=0;i<y.length;i++)
		{

		char w=y[i];

		list.add(w);

		}

		Set<Character> uni=new HashSet<Character>(list);

		for(Character temp:uni)
		{
		//System.out.println(temp);
		System.out.println(temp+":"+Collections.frequency(list, temp));

		}
	

	}

}
