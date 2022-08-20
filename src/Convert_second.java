import java.util.*;

public class Convert_second {

	public static void main(String[] args) {
		
		double sec,hr,min;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Second= ");
		sec=sc.nextInt();
		
		hr=sec/3600;
		min=sec/60;
		
		System.out.println("Enter hours "+hr);
		System.out.println("Enter minutes "+min);

	}
}
