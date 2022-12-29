package org.Parker.AniApp.Arraylist;
import java.util.ArrayList;
import java.util.Collections;
import org.Parker.AniApp.HelperMethod;
public class ArrayListPrct1 extends HelperMethod
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> marks=HelperMethod.readArrayListElements1();
		ArrayList<Integer> marks1=HelperMethod.readArrayListElements1();
		doArrayListOp(marks,marks1);
	}

	private static void doArrayListOp(ArrayList<Integer> marks,ArrayList<Integer> marks1)
	{
		marks.forEach(System.out::println);
		String b=marks.contains(2)?"true":"false";
		System.out.println(b);
		
		
	}
}
