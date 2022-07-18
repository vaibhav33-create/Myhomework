package Selenium1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class july17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "vaibhav bansude";
		String rev="";
		String[] ar = s.split(" ");

		char[] word = s.toCharArray();
		Map<Character, Integer> chmp = new HashMap<Character, Integer>();
		for(Character ch : word) {
			if(chmp.containsKey(ch)) {
				chmp.put(ch, chmp.get(ch)+1);
			}else {
				chmp.put(ch, 1);
			}
		}
		
		Set<Map.Entry<Character, Integer>> entryset = chmp.entrySet();
		for(Map.Entry<Character, Integer> ent : entryset) {
			if(ent.getValue()>1) {
				System.out.println(ent.getKey());
			}
		}
		
	}

}
