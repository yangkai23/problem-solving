package org.Parker1.Shannu.Regex;

import java.util.*;
import java.util.regex.*;

public class DuplicateWordsRegex {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String st=sc.nextLine();
	System.out.println(getSentence(st));
	sc.close();
}

private static String getSentence(String st) {
//	String ar[]=st.split(" ");
//	Object a[]=Arrays.stream(ar).distinct().toArray();
//	String str="";
//	for(Object obj:a)
//			str=str+obj+" ";
//	return str;
	String str="\\b(\\w+)(?:\\W+\\1\\b)+";
	Pattern pt=Pattern.compile(str);
		Matcher matcher=pt.matcher(st);
		System.out.println(matcher.matches());
		while(matcher.find()) {
			System.out.println("Hi   "+matcher.group(1));
			st=st.replaceAll(matcher.group(), matcher.group(1));
		}
		return st;
}
}
