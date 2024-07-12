package CollectionLearning;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListSample {

	public static void main(String[] args) {
		
		LinkedList<Integer> aList=new LinkedList<Integer>();
		
		for(int i=1;i<=10;i++) {
			
			aList.add(i);
			
		}
		
		System.out.println(aList);
		System.out.println("Get First value"+aList.getFirst());
		System.out.println("Get Last Value"+aList.getLast());
		
		Iterator<Integer> sList=aList.iterator();
		
		while(sList.hasNext()) {
			
			System.out.println(sList.next());
		}
		
		List<String> str=new LinkedList<String>();
		str.add("Jai");
		str.add("Sri");
		str.add("Tamil");
		str.add("Ammu");
		str.add("Sri");
		System.out.println(str);
	
		System.out.println(str.get(1));
		System.out.println(str.remove("Sri"));
		System.out.println(str);
		

	}

}
