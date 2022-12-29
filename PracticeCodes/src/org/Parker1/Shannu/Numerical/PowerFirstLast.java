package org.Parker1.Shannu.Numerical;
import java.util.Scanner;
public class PowerFirstLast {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	double d=powFirstLast(n);
	System.out.println(d);
	sc.close();
}
public static double powFirstLast(int n) {
		String s=String.valueOf(n);
		int x=s.charAt(0)-'0';
		int y=s.charAt(s.length()-1)-'0';
	return Math.pow(x, y);
}
}
