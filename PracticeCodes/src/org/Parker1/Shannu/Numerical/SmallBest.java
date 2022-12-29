package org.Parker1.Shannu.Numerical;

import java.util.Scanner;

public class SmallBest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		SmallBest sb=new SmallBest();
		System.out.println(sb.generateSmallest(n));
		sc.close();
	}
	public int generateSmallest(int n) {
		String s=String.valueOf(n);int k=Integer.MAX_VALUE;String st="";int i=0;
		while(i<s.length()) {
			st=st+s.charAt(i);
			if(Integer.parseInt(st)<k&&st.length()==2) {
				int x=reverse(st);
				if(x<Integer.parseInt(st))
					k=x;
				else
					k=Integer.parseInt(st);
			}
			if(st.length()>2) {
				st="";
				i=i-2;
			}
			i++;
		}
		return k;
	}
	private int reverse(String st) {
		StringBuilder sb=new StringBuilder(st);
		return Integer.parseInt(sb.reverse().toString());
	}
}
