package stringDemo;

import java.util.TreeMap;
import java.util.TreeSet;

public class Demo3 {

	public static void main(String[] args) {

		
		TreeSet<Integer>ts=new TreeSet<Integer>();
		
		ts.add(1);
		ts.add(2);
		ts.add(4);
		ts.add(3);
		ts.add(5);
		
		System.out.println(ts);
		
		for(Object  obj:ts) {
			
			System.out.println(obj);
		}
		
		TreeMap<String,String> tm=new TreeMap<String, String>();
		
		tm.put("ind","India");
		tm.put("nz","NewZealnd");
		tm.put("uk","United Kingdom");
		
		System.out.println(tm.descendingMap());
		
		System.out.println(tm.firstKey());
		System.out.println(tm.lastKey());
		System.out.println(tm.lastEntry());
		System.out.println(tm.headMap("uk"));
		System.out.println(tm.pollLastEntry());
		System.out.println(tm);
		System.out.println(tm.pollFirstEntry());
		System.out.println(tm);
	

	}

}
