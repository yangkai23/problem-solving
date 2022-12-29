package org.Parker.AniApp.treeset;

import java.util.TreeSet;

public class TreeSetPrct {
public static void main(String[] args) {
	TreeSet<Integer>ts1=new TreeSet<Integer>();
	ts1.add(2);ts1.add(556);ts1.add(214);ts1.add(845);ts1.add(65);ts1.add(54);ts1.add(456);
	ts1.forEach(i->System.out.println(i));
//pollfirst//first//last
	//polllast//higher//lower
//	TreeSet<Integer>ts2=(TreeSet<Integer>) ts1.clone();
//	System.out.println(ts2);
//	System.out.println(ts1.headSet(500));
//	
//	System.out.println(ts1.headSet(900, true));
//System.out.println(	ts1.higher(500));
//	System.out.println(ts1.tailSet(200));
//	System.out.println(ts1.ceiling(500));
//System.out.println(ts1.floor(500));
	}
}
