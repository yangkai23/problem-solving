package org.Parker1.Shannu.Arrays;
import java.util.*;
public class BulbLightened {
	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i]=sc.nextInt();
		}
		System.out.println(findNo_OfBulbsLightened(ar));
		sc.close();
	}
	private static int findNo_OfBulbsLightened(int[] ar) {
		int count=0;
		for(int i=1;i<ar.length;i++) {
			if(sorted(i,ar))
				count++;
		}
		return count;
	}
	private static boolean sorted(int n,int ar[]) {
		int a[]=new int[n+1];
		for(int i=0;i<=n;i++) {
			a[i]=ar[i];
		}
		if(n==1) {
			if(a[0]==1)
				return true;
		}
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		for (int i = 1; i <=n+1; i++) {
			if(a[i-1]!=i) {
				return false;
			}
		}
		return true;
	}
}
