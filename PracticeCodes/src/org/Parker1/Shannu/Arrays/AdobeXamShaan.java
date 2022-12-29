package org.Parker1.Shannu.Arrays;
import java.util.Scanner;
public class AdobeXamShaan {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int ar[]=new int[n];
	for(int i=0;i<ar.length;i++) {
		ar[i]=sc.nextInt();
	}
	System.out.println(findIndex(ar));
	sc.close();
}

public static int findIndex(int[] ar) {
	
	for(int i=1;i<ar.length;i++) {
		int prod=1;
		if(ar.length==1) {
			if(ar[0]*ar[0]==ar[0])
				return 1;
			else
				return -1;
		}
		for (int j = 0; j <i; j++) {
				for (int k = 0; k <i; k++) {
					if(ar[j]*ar[k]==ar[i])
						return i;
				}
		}
	}
	return -1;
}
}
