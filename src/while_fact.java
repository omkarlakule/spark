
	import java.util.Scanner;


	public class while_fact {
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			int i=1,n,fact=1;
			Scanner obj=new Scanner(System.in);
			System.out.println("enter factorial number=");
			n=obj.nextInt();
			
			while(i<=n)
			{	
			fact=fact*i;
			i++;
			}
			System.out.println("fact="+fact);
		}

	}
	 

