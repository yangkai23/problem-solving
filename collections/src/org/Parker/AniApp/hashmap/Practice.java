package org.Parker.AniApp.hashmap;

import java.util.*;
public class Practice implements Comparator<String> {
	public static void main(String[] args) {
		HashMap<Integer, Integer> hs=new HashMap<Integer, Integer>();
		hs.put(2, 5);hs.put(3, 6);hs.put(4, 5);hs.put(5, 7);
		System.out.println(hs);
		
		for(Map.Entry<Integer, Integer> e:hs.entrySet()) {
			if(e.getValue()==5)
				System.out.println(e.getKey());
		}
		
		
//		System.out.println(hs.get(3));
//		Set s=hs.entrySet();
//		System.out.println(s);
//		HashMap<Integer, Integer> hss=(HashMap)hs.clone();
//		System.out.println(hss);
//		hss.putAll(hs);
//		System.out.println(hss);
//		for(Map.Entry<Integer, Integer> e: hs.entrySet()) {
//			if(e.getValue()==5)
//				System.out.println(5*5);
//		}
//		Set<Integer> set=hs.keySet();
//		System.out.println(set);
//		Collection<Integer> col=hs.values();
//		System.out.println(col);
//		System.out.println(hs.size());
	}
	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}
}
