package CollectionLearning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListExamples {

	public static void main(String[] args) {





		ArrayList<Integer> aList=new ArrayList<Integer>();//flexible size and support 

		for(int i=1;i<=10;i++) {

			aList.add(i);


		}
		aList.add(100);//Appand the value
		aList.add(100);
		aList.add(100);
		System.out.println(aList);
		System.out.println(aList.get(4));//get value from arraylist

		aList.set(0, 50);//Update the ArrayList
		System.out.println("Update the ArrayList"+aList);

		aList.remove(4);

		System.out.println("Delete the value from ArrayList"+aList);

		boolean contains = aList.contains(75);
		System.out.println(contains);

		System.out.println("------------------------");
		for(int i:aList) {

			System.out.println(i);
		}
		System.out.println("Iterator");
		Iterator<Integer>i=aList.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("------------------------");
		for(int w=0;w<aList.size();w++) {
			System.out.println(aList.get(w));

		}
		System.out.println("------------------------");
		ListIterator<Integer>iterator=aList.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("------------------------");

		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
		System.out.println("------------------------");

		List<Integer>sList=new ArrayList<Integer>();
		sList.addAll(aList);
		Iterator<Integer> s=sList.iterator();
		while(s.hasNext()) {

			System.out.println("Another List:"+s.next());
		}
	}
	
	





}
