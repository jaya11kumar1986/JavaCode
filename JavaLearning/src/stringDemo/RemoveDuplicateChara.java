package stringDemo;

public class RemoveDuplicateChara {

	public static void main(String[] args) {
		
		String name="aabb";
		String name1="aabbccddeefgg";
		
		char[]c1=name1.toCharArray();
		
	
		
		for(int i=0;i<c1.length;i++) {
			
			for(int j=i+1;j<c1.length;j++) {
				
				if(c1[i]==c1[j]) {
					
					System.out.print(c1[i]+" ");
				}
			}
		}

	}

}
