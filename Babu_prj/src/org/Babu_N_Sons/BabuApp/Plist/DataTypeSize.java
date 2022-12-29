package org.Babu_N_Sons.BabuApp.Plist;

import java.io.FileWriter;
import java.io.IOException;

public class DataTypeSize {
public static void main(String[] args) throws IOException {
	FileWriter fw=new FileWriter("file.txt");
	for(int i=1;i<=20;i++) {
		if(i%2==0)
			fw.write(""+i+" ");
	}
	fw.close();
}
}
