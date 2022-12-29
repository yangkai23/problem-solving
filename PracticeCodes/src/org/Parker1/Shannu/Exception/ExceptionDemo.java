package org.Parker1.Shannu.Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionDemo {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String n=br.readLine();
		System.out.println(n);
		System.out.println(n.length());
		System.out.println(n.charAt(19));
		//	int ar[]=new int[n];
		//	for(int i=0;i<ar.length;i++) {
		//		ar[i]=Integer.parseInt(br.readLine());
		//	}
		//	System.out.println(ar[5]);
	}
}
