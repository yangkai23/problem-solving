package org.Parker.AniApp.treemap;
import java.util.*;
import java.util.Map.Entry;
public class Practice {
public static void main(String[] args) {
	TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
		tm.put(10, "a");tm.put(78, "ll");tm.put(20, "tg");tm.put(50, "a");tm.put(70, "mnc");
		System.out.println(tm);
		Iterator<Entry<Integer, String>> it=tm.entrySet().iterator();
		while(it.hasNext()) {
			Entry<Integer, String> entry=it.next();
			int key=entry.getKey();
			String val=entry.getValue();
		}
//		tm.forEach((k,v)->System.out.println(k+" "+v));
//		Map.Entry<Integer, String> m=tm.floorEntry(50);
//		System.out.println(m);
//		Map.Entry<Integer, String> mb=tm.ceilingEntry(50);
//		System.out.println(mb);
//		System.out.println(tm.ceilingKey(52));
//		System.out.println(tm.floorKey(20));
//	System.out.println(tm.higherEntry(20));
//	System.out.println(tm.lowerEntry(20));
//	System.out.println(tm.higherKey(52));
//	System.out.println(tm.lowerKey(20));

//	SortedMap<Integer, String> t=tm.subMap(20, 70);
//	System.out.println(t);
//		tm.higherKey(20);
//		tm.lowerKey(50);
//		System.out.println(tm.headMap(20, false));
//		System.out.println(tm.tailMap(50, false));
System.out.println(tm.headMap(50));
Map<Integer, String> v=tm.tailMap(50);
System.out.println(v);
		Set<Integer> set=tm.descendingKeySet();
		System.out.println(set);
//		System.out.println(tm.firstEntry());
//		System.out.println(tm.lastEntry());
//		System.out.println(tm.firstKey());
//		System.out.println(tm.lastKey());
//		System.out.println(tm.pollFirstEntry());
//		System.out.println(tm.pollLastEntry());
//		System.out.println(tm);
		
//		Set<Integer> s=tm.keySet();
//		for(Integer a:s)
//			System.out.println(a);
}
}

