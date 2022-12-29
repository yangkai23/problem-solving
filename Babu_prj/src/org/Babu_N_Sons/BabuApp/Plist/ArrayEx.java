package org.Babu_N_Sons.BabuApp.Plist;
import java.util.Scanner;
public class ArrayEx {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		char d=sc.next().charAt(0);
			if(c>d) {
			System.out.print(d);
	        System.out.print(c);
			}
			else {
				System.out.print(c);
		        System.out.print(d);
			}
		sc.close();
		
	}
}
