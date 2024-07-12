package share;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

	public static void main(String[] args) {
		
		String a="automation";
		
		Map<Character,Integer> map=new HashMap<Character, Integer>();
		
		for(int i=0;i<a.length();i++) {
			
			if(map.containsKey(a.charAt(i))) {
				
				map.put(a.charAt(i),map.get(a.charAt(i))+1);
			}
			
			else {
				map.put(a.charAt(i),1);
			}
		}
		
		System.out.println(map);

	}

}
