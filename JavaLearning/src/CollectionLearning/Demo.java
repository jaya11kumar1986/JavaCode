package CollectionLearning;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap hm = new HashMap();
		hm.put("ind", "India");
		hm.put("nz", "NewZealand");
		hm.put("uk", "UnitedKingdom");
		
		hm.keySet();
		System.out.println(hm.keySet());
		
		System.out.println(hm.values());
		
		System.out.println(hm.entrySet());
		
		HashMap hm1=new HashMap();
		
		hm1.putAll(hm);
		System.out.println(hm1);
		System.out.println(hm.get("uk"));
		System.out.println(hm1.entrySet());
		
		System.out.println(hm1.remove("uk"));
		System.out.println(hm1.entrySet());
		
		Set entrySet = hm1.entrySet();
		Iterator i=entrySet.iterator();
		while(i.hasNext()) {
			Map.Entry me=(Map.Entry) i.next();
			//System.out.println(me.getKey()+"-----"+me.getValue());
			
			if(me.getValue().equals("NewZealand")){
				me.setValue("America");
			
			}
			System.out.println(me.getKey()+"-----"+me.getValue());	
		}

	}

}
