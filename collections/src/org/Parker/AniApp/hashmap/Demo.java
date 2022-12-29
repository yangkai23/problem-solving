package org.Parker.AniApp.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Demo {
public static void main(String[] args) {
	HashMap<Integer, String> hm=new HashMap<Integer, String>();
	hm.put(1, "ani");
	hm.put(2, "shanmukha");
	hm.put(3, "parker");
	hm.put(4, "peter");
	System.out.println(hm);
			Iterator<Entry<Integer, String>> itr=hm.entrySet().iterator();
			while(itr.hasNext()) {
					Map.Entry<Integer,String> map=itr.next();
				System.out.println("key "+map.getKey()+"  value "+map.getValue());
			}
}
}
