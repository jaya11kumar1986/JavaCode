package CollectionLearning;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm = new HashMap();
		hm.put("ind", "India");
		hm.put("nz", "NewZealand");
		hm.put("uk", "UnitedKingdom");
		// print the size
		System.out.println(hm.size());
		System.out.println(hm);
		
		if (hm.containsKey("ind")) {
			System.out.println(hm.get("ind"));
		}
		System.out.println(hm.get("nz"));
		// print all the keys
				System.out.println(hm.keySet());
				// print all the values
				System.out.println(hm.values());
				
				// 1st way
				Set keys = hm.keySet();
				Iterator itrkeys = keys.iterator();
				String s;
				while (itrkeys.hasNext()) {
					System.out.println(s = (String) itrkeys.next());
					System.out.println(hm.get(s));
				}
				System.out.println("-----------");
	}

}
