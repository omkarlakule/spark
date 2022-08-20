import java.util.Scanner;

public class Milk {

	public static void main(String[] args) {
	    
		int a,b,c;
		double p=3.25,p1=4.15,d,e,pro;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of liter of milk= ");
		
		a=sc.nextInt();
		b=a/4;
		
		
			System.out.println("Enter the amount of water add to the milk= "+b);
		
		c=a+b;
		
			System.out.println("Enter the final amount of liter of milk and water mix= "+c);
		
		d=a*p;
		e=c*p1;
		pro=e-d;
		
			System.out.println("Enter the profit amount= "+pro+" rupees");
		
	}

}
