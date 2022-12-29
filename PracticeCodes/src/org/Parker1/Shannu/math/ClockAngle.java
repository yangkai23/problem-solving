package org.Parker1.Shannu.math;
import java.util.Scanner;
public class ClockAngle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter time in this format   \nhour:min");
		String time=sc.nextLine();
		String angle=getAngle(time);
		System.out.println(angle+" degrees");
		sc.close();
	}
	public static String getAngle(String time) {
		int index=time.indexOf(':');
		double hour=Double.parseDouble(time.substring(0, index));
		double min=Double.parseDouble(time.substring(index+1,time.length()));
		if(hour>12)
			hour=hour-12;
		if(hour>12||min>59) {
			return "invalid time format";
		}
		double hour_angle=hour*30;
		double min_angle=(double)(min/5)*30;
		double angle= Math.abs(hour_angle-min_angle);
		String s=String.valueOf((int)angle);
		return s;
	}
}
