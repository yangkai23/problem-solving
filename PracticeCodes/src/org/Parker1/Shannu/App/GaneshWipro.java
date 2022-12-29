package org.Parker1.Shannu.App;
import java.util.Scanner;
public class GaneshWipro {
	static	public String[] transformCodes1(int[] input1) {
		String[] st=new String[input1.length];
		for(int i=0;i<input1.length;i++) {
			String ans="";int temp=input1[i],count=0, p;
			if(input1[i]%2==0)
				p=input1[i]/2;
			else
				p=(input1[i]-1)/2;
			do {
				count++;
				input1[i]=input1[i]/10;
			}while(input1[i]!=0);
			if(count==6)
				ans=ans+"C";
			else
				ans=ans+"W";
			if(temp==0)
				ans=ans+"Z";
			else if(temp==1)
				ans=ans+"O";
			boolean prime=checkPrime(temp);
			if(prime==true)
				ans=ans+"P";
			else
				ans=ans+"N";
			while(temp>9) {
				int sum=0;
				do {
					int k=temp%10;
					sum=sum+k;
					temp=temp/10;
				}while(temp!=0);
				temp=sum;
			}
			ans=ans+temp;
			ans=ans+p;
			st[i]=ans;
		}
		return st;
	}
	static	public boolean checkPrime(int n) {
		for(int i=2;i<n/2;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		String res[]=transformCodes1(ar);
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]+" ");
		}
		sc.close();
	}
}
