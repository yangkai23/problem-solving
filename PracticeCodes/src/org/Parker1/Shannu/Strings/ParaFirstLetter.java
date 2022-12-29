package org.Parker1.Shannu.Strings;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class ParaFirstLetter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
//		System.out.println(getNewPara(s));
		System.out.println(getNumWords(s));
		sc.close();
	}

	private static String getNewPara(String s) {
		String pr[]=s.split(" ");
		StringBuilder sb=null;
		String st="";
		for(int i=0;i<pr.length;i++) {
			if(pr[i].charAt(0)>=97&&pr[i].charAt(0)<=123) {
				sb=new StringBuilder(pr[i]);
				sb.setCharAt(0,(char)(sb.charAt(0)-32)) ;
				st=st+sb.toString()+" ";
			}
			else
				st=st+pr[i]+" ";
		}
		return st;
	}
public static int getNumWords(String s) {
	int count=0;
	String vowel="aeiouAEIOU";
	char ch[];
	String pr[]=s.split(" ");
	for(int i=0;i<pr.length;i++) {
		ch=pr[i].toCharArray();
		
//		System.out.println(vcount);
//		if(vcount>=2)
//			count++;
	}
	return count;
}}
