package org.Parker1.Shannu.Strings.stringBuffer;
public class First {
public static void main(String[] args) {
	String s=new String("Shanmukha");
	String st=s.concat("Anirudh");
	System.out.println(s+st);
	StringBuffer sb=new StringBuffer("Shanmukha");
	sb.append("Anirudh");
	System.out.println(sb);
}
}
