package Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Excercise2 {

	public static void main(String[] args) {
		
		String name="LLAAWWRR";
		
		char c[]=name.toCharArray();
		
		List<Character> cha=new ArrayList<Character>();
		
//		for(int i=0;i<c.length;i++) {
//			
//			char w=c[i];
//			cha.add(w);
//		}
		
		Set<Character>chaS=new HashSet<Character>();
		for(int i=0;i<c.length;i++) {
			char w=c[i];
			chaS.add(w);
		}
		
		Iterator<Character>it=chaS.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
			
		}

	}

}
