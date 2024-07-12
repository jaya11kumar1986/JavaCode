package stringDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
	
		HashMap<String,Integer> hm=new HashMap<String, Integer>();
		
		hm.put("Pen",20);
		hm.put("Pencil",30);
				System.out.println(hm);
		hm.put("Pen",40);//Update the value
		System.out.println(hm);
		
		
		HashMap<String,Integer> hm2=new HashMap<String, Integer>();

		hm2.putAll(hm);//PutAll
		
		System.out.println(hm2);
		
		System.out.println(hm.get("Pen"));//Get value 
		
		System.out.println(hm.containsKey("Pen"));//Check key if there key present or not
		
		System.out.println(hm.containsValue(20));
		
		for(Entry<String,Integer> en:hm.entrySet()) {
			
			//System.out.println(en);
			System.out.println(en.getKey()+"*"+en.getValue());
		}
		
		Set<Entry<String,Integer>> entrySet = hm.entrySet();
		
		Iterator it=entrySet.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		
		
		
	}

}
