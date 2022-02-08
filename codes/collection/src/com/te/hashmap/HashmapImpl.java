package com.te.hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapImpl {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("Ajay", "9538717375");
		map.put("papa", "9845833198");
		map.put("Akka", "9900968999");
		map.put("Putti", "8746965999");
		System.out.println(map);
		System.out.println(map.get("papa"));
		Set<String> keySet = map.keySet();
		
		Set<Entry<String,String>> entrySet = map.entrySet();
		
		for(Entry<String, String> q : entrySet) {
			System.out.println(q.getKey()+" : "+q.getValue());
		}
		
		for(String s : keySet) {
			System.out.println(s+" : "+map.get(s));
		}
	}
}
