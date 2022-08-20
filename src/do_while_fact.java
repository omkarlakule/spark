

	import java.util.Scanner;


	public class do_while_fact {
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			int i=1,n,fact=1;
			Scanner obj=new Scanner(System.in);
			System.out.println("enter fact number=");
			n=obj.nextInt();
			
			do
			{
				fact=fact*i;
				i++;
				}
			while(i<=n);	
			
			
			System.out.println("fact="+fact);
		}
		

	}


