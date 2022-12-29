package org.Parker1.Shannu.Sort;
import java.util.Arrays;
import java.util.Scanner;
public class BubbleSort {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int []ar=new int[n];
	for(int i=0;i<ar.length;i++) {
		ar[i]=sc.nextInt();
	}
	bubbleSortArr(ar);
	sc.close();
}
private static void bubbleSortArr(int[] ar) {
	for(int i=1;i<ar.length;i++) {
		for(int j=0;j<ar.length-i;j++) {
			if(ar[j]>ar[j+1]) {
				int temp=ar[j];
				ar[j]=ar[j+1];
				ar[j+1]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(ar));
}
}
