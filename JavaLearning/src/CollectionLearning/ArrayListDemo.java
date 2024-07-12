package CollectionLearning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
	
	public static void main(String[] args) {

		ArrayList lst = new ArrayList();
		
		lst.add(10);// Wrapped Object
		lst.add(true);// Wrapped Object
		lst.add("Hello");
		lst.add(new String("Chennai"));
		lst.add(new Orange());
		Orange o1 = new Orange();
		lst.add(o1);

		// no of elements(Objects)
		System.out.println(lst.size());

		System.out.println(lst.contains(true));
		System.out.println(lst.contains("Hello"));
		System.out.println(lst.contains(new String("Chennai")));
		System.out.println(lst.contains("Chennai"));
	System.out.println(lst.contains(new Orange()));
	System.out.println(lst.contains(o1));

		System.out.println("------get specific object");

		System.out.println(lst.get(3));
		System.out.println(lst.get(4));

		System.out.println("----get all objects and print---");
		for (int i = 0; i < lst.size(); i++) {
			System.out.println(lst.get(i));
		}

		System.out.println("----get all objects and print using enhanced for loop---");
		for (Object obj : lst) {
			System.out.println(obj);
		}

		ArrayList<String> lst1 = new ArrayList();
		lst1.add("Ashikali");
		lst1.add("Naren");
		lst1.add("Rajarajan");
		
		System.out.println("----get all String objects and print using enhanced for loop---");
		for (String str : lst1) {
			System.out.println(str);
		}
		
		System.out.println("converting to object array and printing objects");
		Object[] objs = lst.toArray();

		for (Object o : objs) {
			System.out.println(o);
		}

		System.out.println("Using iterator");
		Iterator itr = lst.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("Using ListIterator");
		ListIterator litr = lst.listIterator();

		while (litr.hasNext()) {
			System.out.println(litr.next());
		}

		System.out.println("Going reverse");

		while (litr.hasPrevious()) {
			System.out.println(litr.previous());
		}

		List lst2 = new ArrayList();
		lst2.add("Java");
		lst2.add(100);
		lst2.add(1, true);
		System.out.println(lst2);

		lst1.addAll(lst2);
		System.out.println(lst1);

		lst.remove(1);// remove at index
		System.out.println(lst);

		lst.remove(Integer.valueOf(10));// Wrap it to remove a primitve value
		// lst.remove(new Integer(10));
		System.out.println(lst);

		lst.remove(o1);// remove an object(ref var)
		System.out.println(lst);

		System.out.println(lst1);
		lst1.removeAll(lst2);// Remove all removes items in the given list
		System.out.println(lst1);
		lst1.addAll(lst2);
		System.out.println(lst1);
		lst1.retainAll(lst2);// Retain all ,retains items in the list
								// and removes the rest
		System.out.println(lst1);

		lst1.clear();
		System.out.println(lst1);// clears the list

	}

}
