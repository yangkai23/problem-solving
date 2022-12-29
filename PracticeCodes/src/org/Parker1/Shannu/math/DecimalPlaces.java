package org.Parker1.Shannu.math;
import java.math.BigDecimal;
public class DecimalPlaces {
@SuppressWarnings("static-access")
public static void main(String[] args) {
	
	double x=54.538752;
	int places=4;
	BigDecimal bg=new BigDecimal(Double.toString(x));
	bg=bg.setScale(places, bg.ROUND_HALF_DOWN);
	System.out.println(bg);
	return;
}
}
