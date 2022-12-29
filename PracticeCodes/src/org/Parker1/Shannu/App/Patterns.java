package org.Parker1.Shannu.App;

import java.util.Scanner;

public class Patterns {
	static void printPattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=n-i+1;j<=n;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		printPattern(n);
		sc.close();
	}

}
