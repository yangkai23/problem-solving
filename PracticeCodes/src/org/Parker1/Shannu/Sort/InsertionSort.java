package org.Parker1.Shannu.Sort;
import java.util.Arrays;
import java.util.Scanner;
public class InsertionSort {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int []ar=new int[n];
	for(int i=0;i<ar.length;i++) {
		ar[i]=sc.nextInt();
	}
	insertionSortArr(ar);
	sc.close();
}
private static void insertionSortArr(int[] ar) {
		for(int i=1;i<ar.length;i++) {
			int key=ar[i];
			System.out.println("key: "+key);
			int j=i-1;
			while(j>=0&&key<ar[j]) {
				ar[j+1]=ar[j];
				j--;
			}
			ar[j+1]=key;
		}
		System.out.println(Arrays.toString(ar));
}
}
