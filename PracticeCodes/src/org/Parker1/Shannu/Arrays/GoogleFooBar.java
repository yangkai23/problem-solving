package org.Parker1.Shannu.Arrays;
import java.util.*;
public class GoogleFooBar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		int rep=sc.nextInt();
		int data[]=solution(ar,rep);
		System.out.println(Arrays.toString(data));
		sc.close();
	}
	public static int[] solution(int[] data, int n) {
		List<Integer> list=new LinkedList<>();
		boolean match[]=new boolean[data.length];
		for(int i=0;i<data.length;i++) {
			if(!match[i]) {
				match=getcount(i,data,match,n);
			}
		}
		System.out.println(Arrays.toString(match));
		for(int i=0;i<data.length;i++) {
			if(!match[i])
				list.add(data[i]);
		}
		int ar[]=list.stream().mapToInt(i->i).toArray();
		return ar;
	}
	public static boolean[] getcount(int i, int[] data, boolean[] match,int n) {
		int count=0;
		for(int j=i;j<data.length;j++) {
			if(!match[j])
				if(data[i]==data[j]) {
					count++; 
					match[j]=true;	
				}
		}
		if(count<=n) {
			for(int j=i;j<data.length;j++) {
				if(data[i]==data[j])
					match[j]=false;
			}
		}
		return match;
	}
}
