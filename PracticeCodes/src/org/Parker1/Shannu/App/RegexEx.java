package org.Parker1.Shannu.App;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx {
	int matchPattern(String st,String n) {
		int count=0;
		String pattern="\\b"+n+"\\b";
		Pattern p=Pattern.compile(pattern,Pattern.CASE_INSENSITIVE);
		Matcher m=p.matcher(st);
		while(m.find()) {
			count++;
		}
		return count;
	}
public static void main(String[] args) {
	RegexEx reg=new RegexEx();
	Scanner sc=new Scanner(System.in);
	String st=sc.nextLine();
	String n=sc.next();
	int occ=reg.matchPattern(st, n);
	System.out.println(occ);
	sc.close();
}
}
