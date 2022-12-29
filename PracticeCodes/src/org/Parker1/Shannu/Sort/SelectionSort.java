package org.Parker1.Shannu.Sort;
import java.util.Arrays;
import java.util.Scanner;
public class SelectionSort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []ar=new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		selectionSortArr(ar);
		sc.close();
	}
	private static void selectionSortArr(int[] ar) {
				for(int i=1;i<ar.length;i++) {
					int min=i-1;
					for(int j=i;j<ar.length;j++) {
						if(ar[j]<ar[min])
							min=j;
					}
					int t=ar[i-1];
					ar[i-1]=ar[min];
					ar[min]=t;
				}
				System.out.println(Arrays.toString(ar));
	}
	}
