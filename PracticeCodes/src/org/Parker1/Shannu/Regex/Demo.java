package org.Parker1.Shannu.Regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String st=br.readLine();
	String  pattern="^([A-Z]+)*[!@#$%^&*()_+a-z0-9]+([A-Z]+)*$";
	regexTest(st,pattern);
	
}
	static public void regexTest(String tocheck,String match) {
		Pattern pt=Pattern.compile(match);
		Matcher mat=pt.matcher(tocheck);
		if(mat.matches()) {
			if(tocheck.length()<5)
			System.out.println("Strength is weak");
			else if(tocheck.length()>5&&tocheck.length()<10)
				System.out.println("Strength is medium");
			else
				System.out.println("Strength is strong");
			}
		else
			System.out.println("Password does not match the criteria");
		}
}
