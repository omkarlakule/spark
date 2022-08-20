

	import java.util.Scanner;


	public class swapping {
		
		
		public static void main(String[] args)
		
		{
			int a,b;
			Scanner obj=new Scanner (System.in);
			
			System.out.println("enter a,b");
			
			a=obj.nextInt();
			
			b=obj.nextInt();
			
			a=a+b;
			b=a-b;
			a=a-b;
			
			System.out.println("after swapping="+a+"  "+b);
			
			
		}

	}



