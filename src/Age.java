import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a= ");
		a=sc.nextInt();
		System.out.println("Enter b= ");
		b=sc.nextInt();
		System.out.println("Enter c= ");
		c=sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("a is oldest");
			if(b>c)
			{
				System.out.println("b is youngest");
			}
			else
			{
				System.out.println("c is youngest");
			}
			
		}
		else if(b>a && b>c)
		{
			System.out.println("b is oldest");
			if(a<c)
			{
				System.out.println("a is youngest");
			}
			else
			{
				System.out.println("c is youngest");
			}
			
		}
		else if(c>a && c>b)
		{
			System.out.println("c is oldest");
			if(b<a)
			{
				System.out.println("b is youngest");
			}
			else
			{
				System.out.println("a is youngest");
			}
		}
	}

}
