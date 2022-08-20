
	import java.util.Scanner;


	public class switchprimeno {

		public static void main(String[] args)
		{
			{
			int i,c;
			
			Scanner sc=new Scanner(System.in);
			System.out.print("enter number=");
			
			int n=sc.nextInt();
			
			System.out.println("prime numbers between 1 to are"+n);
			
			for(int j=2;j<=n;j++)
			{
			c=0;
			for(i=1;i<=j;i++)
			{	
				if(j%i==0) 
					
			{
			c++;
			}
			}
			if(c==2)
			System.out.print(" "+j);
				
			}
			}
		}
	}


