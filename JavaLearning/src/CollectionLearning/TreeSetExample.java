package CollectionLearning;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		String a="aaAABBbb";
		
		char b[]=a.toCharArray();
		
	Set<Character>c=new TreeSet<Character>();
	for(int i=0;i<b.length;i++) {
		
		char d=b[i];
		c.add(d);
	}
	
	Iterator<Character>it=c.iterator();
	while(it.hasNext()) {
		
		System.out.println(it.next());
	}
	Set<Integer>num=new TreeSet<Integer>();
	num.add(10);
	num.add(100);
	num.add(30);
	num.add(12);
	
	System.out.println(num.hashCode());
	System.out.println(num.size());
	System.out.println(num.toString());
	System.out.println(num.getClass());
	
	System.out.println(Collections.max(num));
	System.out.println(Collections.min(num));
	System.out.println(Collections.frequency(c, it));
	}

}

