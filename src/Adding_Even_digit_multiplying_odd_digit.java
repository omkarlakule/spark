import java.util.Scanner;

public class Adding_Even_digit_multiplying_odd_digit {

	public static void main(String[] args) {
		
		int n,i,sumE,sumO;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		sumE=0;
		sumO=0;
		while(n!=0)
		{
			i=n%10;
			if(i%2==0)
			{
				sumE=sumE+i;
			}
			else
			{
				sumO=sumO+i;
			}
			n=n/10;
		}
		System.out.println("Sum of even number "+sumE);
		System.out.println("Sum of odd number "+sumO);
	}

}
