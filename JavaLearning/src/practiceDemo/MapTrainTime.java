package practiceDemo;

import java.util.HashMap;
import java.util.Map;

public class MapTrainTime {

	public static void main(String[] args) {
		
		
		Map<String,Double> map=new HashMap<String, Double>();
		
		map.put("Pandian Exp",21.00);
		map.put("Vaigai Exp",22.00);
		map.put("Nellai Exp",21.00);
		map.put("Kan Exp",23.00);
		
		
		for(Map.Entry<String,Double> em:map.entrySet()) {
			
			if(em.getValue()==21.00) {
				
				System.out.println(em.getKey());
				em.setValue(21.30);
				
			}
		}
		System.out.println(map.entrySet());

	}

}
