package org.Parker.AniApp.hashset;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetDemo {
public static void main(String[] args) {
	HashSet<Integer> h1=new HashSet<Integer>();
	h1.add(2);h1.add(85);h1.add(23);h1.add(19);h1.add(74);h1.add(99);
	System.out.println("HashSet: "+h1);
	HashSet<Integer> h2=new HashSet<Integer>();
	h2.add(2);h2.add(22);h2.add(23);h2.add(18);h2.add(74);h2.add(0);
	h2.retainAll(h1);
	System.out.println(h2);
}
}
