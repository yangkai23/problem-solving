package org.Babu_N_Sons.BabuApp.Plist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mod1 {
public static void main(String[] args) throws NumberFormatException, IOException  {
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int a=Integer.parseInt(br.readLine());
	double b=Double.parseDouble(br.readLine());
	char c=br.readLine().charAt(0);
	boolean bl=Boolean.parseBoolean(br.readLine());
	System.out.println(bl);
	System.out.println(c);
	System.out.println(b);
	System.out.println(a);
	br.close();
}
}
