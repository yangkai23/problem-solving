package org.Parker1.Shannu.Regex;
import java.io.*;
import java.util.regex.*;
public class RegexPractice {
public static void main(String[] args) throws Exception {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String st=br.readLine();
	String regex="^(.)?[A-Za-z0-9.-_]+@(gmail|hotmail|outlook|yahoo)(.)+[a-z]$";
	String regex1="pq*";
	Pattern pt=Pattern.compile(regex1);
	Matcher matcher= pt.matcher(st);
	System.out.println(matcher.matches());
}
}
