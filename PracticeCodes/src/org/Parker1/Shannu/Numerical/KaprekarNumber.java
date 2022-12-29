package org.Parker1.Shannu.Numerical;

import java.util.Scanner;

public class KaprekarNumber {
	public static long hasResult=0;
public static boolean isKaprekar(long num) {
	long sq=(long) Math.pow(num, 2);
	int count=getcount(sq);
	int pow=(int) Math.pow(10, count/2);
	if(sq/pow+sq%pow!=num)
	return false;
	return true;
}
public static int getcount(long sq) {
	int count=0;
		while(sq!=0) {
			sq=sq/10;
			count++;
		}
	return count;
}
public static int validateAndPrint(long a,long b) {
	int count=0;String st="";
	if(a<1||b>100000||a>b)return 1;
	for (long i =a; i <=b; i++) {
		if(isKaprekar(i)) {
			count++;
			st=st+i+" ";
		}
	}
	if(count==0)return 2;
	
		System.out.println(st.trim());
		return 0;
	}

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	long a=sc.nextLong();
	long b=sc.nextLong();
	int res=validateAndPrint(a, b);
	if(res==1) {
		System.out.println("invalid input");
		sc.close();
		return;
	}
	if(res==2) {
		System.out.println("invalid range");
		sc.close();
		return;
	}
	sc.close();
}
}
