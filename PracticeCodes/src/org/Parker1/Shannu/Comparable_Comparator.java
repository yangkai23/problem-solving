package org.Parker1.Shannu;
import java.util.TreeSet;
public class Comparable_Comparator {
	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>((Integer x, Integer y)-> x%10>y%10?1:-1);
		ts.add(4);ts.add(556);ts.add(877);ts.add(142);ts.add(121);ts.add(699);ts.add(478);
		System.out.println(ts);
	}
}
