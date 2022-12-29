package org.Parker1.Shannu.fileHandling;

import java.io.*;

public class FrleReadSystem {
public static void main(String[] args) throws IOException {
	File f=new File("D:\\movies\\english");
//	File file=new File("D:\\docs2","demo.txt");
//	file.createNewFile();
//	System.out.println(file.exists());
//	System.out.println(file.delete());
	String files[]=f.list();
	for (String string : files) {
		System.out.println(string);
	}
}
}
