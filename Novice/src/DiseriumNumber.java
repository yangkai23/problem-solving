import java.util.Scanner;

public class DiseriumNumber {
	static boolean isDiserium(int n) {
		
		int c=countDigit(n);
		int sum=0,temp=n;
		do {
			int d=n%10;
			sum=sum+pow(d,c);
			c--;
			n=n/10;
		}while(n!=0);
		return temp==sum;
	}
	static int countDigit(int n) {
		int count=0;
		do {
			n=n/10;
			count++;
		}while(n!=0);
		return count;
	}
	static int pow(int x,int p) {
		int pw=1;
		while(p>0) {
			pw=pw*x;
			p--;
		}
		return pw;
	}
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int v=sc.nextInt();
		boolean res=isDiserium(v);
		if(res==true) {
			System.out.println("Diserium");
		}
		else
			System.out.println("not Diserium");
		sc.close();
}

}


