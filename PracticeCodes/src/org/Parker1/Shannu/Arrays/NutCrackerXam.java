package org.Parker1.Shannu.Arrays;
import java.util.Scanner;
public class NutCrackerXam {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int r=sc.nextInt();
	int unit=sc.nextInt();
	int n=sc.nextInt();
	int ar[]=new int[n];
	for(int i=0;i<ar.length;i++) {
		ar[i]=sc.nextInt();
	}
	System.out.println(getNoHouses(r,unit,ar));
	sc.close();
}
private static int getNoHouses(int r, int unit, int[] ar) {
		int count=0,sum=0;
		int fr=r*unit;
		for(int i=0;i<ar.length;i++) {
			if(sum>fr)
				break;
			sum=sum+ar[i];
			count++;
		}
		return count;
}
}
