package org.Parker.AniApp.hashset;

import java.util.Arrays;
import java.util.HashSet;
//import java.util.Iterator;

public class HashsetPrct {
public static void main(String[] args) {
	HashSet<String> hs=new HashSet<String>();
	hs.add("A");
	hs.add("B");
	hs.add("c");
	hs.add("e");
	hs.add("d");
	HashSet<Integer> hs1=new HashSet<Integer>();
	hs1.add(2);	hs1.add(58);
	hs1.add(4751);
	hs1.add(32);
	hs1.add(100);
//Iterator<String> it=hs.iterator();
//while(it.hasNext()) {
//	String s=it.next();
//	System.out.println(s);
//}

	
	String ar[]=hs.toArray(new String[0]);
	Integer arr[]=hs1.toArray(new Integer[0]);
	
}
}
