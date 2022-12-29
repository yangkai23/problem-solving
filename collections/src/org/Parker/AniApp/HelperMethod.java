package org.Parker.AniApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.LinkedList;

public class HelperMethod {
	public static int[] readArr() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=s.nextInt();
		int x[]=new int[n];
		System.out.println("read the array elements");
		for(int i=0;i<x.length;i++) {
			x[i]=s.nextInt();
		}
		return x;
	}
	public static ArrayList<Integer> readArrayListElements1(){
		ArrayList<Integer> val=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elements u want to add");
		int n=sc.nextInt();
		System.out.println("enter elements u want to add");
		for(int i=0;i<n;i++) {
			val.add(i,sc.nextInt());
		}
		return val;
	}
	public static void displayArr(int x[]) {
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]+" ");
		}
	}
	public static LinkedList<Integer> readLinkedListElements1(){
		LinkedList<Integer> val=new LinkedList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elements u want to add");
		int n=sc.nextInt();
		System.out.println("enter elements u want to add");
		for(int i=0;i<n;i++) {
			val.add(sc.nextInt());
		}
		return val;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		sc.close();
	}

}
