package org.Babu_N_Sons.BabuApp.Plist;
import java.util.Scanner;
public class Practice {
	public static void main(String[] args) {
		Scanner ani =new Scanner(System.in);
		int a=ani.nextInt();
		int b=ani.nextInt();
		int c=sum(a,b);
		System.out.println(c);
		ani.close();
	}
	static int  sum(int a,int b){
		int k=a+b;
		return k;
	}
}
