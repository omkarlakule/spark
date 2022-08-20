import java.util.Scanner;

public class adding_digit_of_no {

	public static void main(String[] args) {
		
		int n,sum,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		sum=0;
		while(n!=0)
		{
			i=n%10;
			sum=sum+i;
			n=n/10;
		}
		System.out.println("Sum of digit "+sum);
	}

}
