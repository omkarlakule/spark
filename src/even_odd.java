
	import java.util.Scanner;


	public class even_odd {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	       
			int n;
			Scanner obj=new Scanner(System.in);
			System.out.println("enter number to check even or odd");
			n=obj.nextInt();
		    
			if( n%2==0 )
			{
				System.out.println("number is even "+n);
				
			}
			else
			{
				System.out.println("number is odd "+n);
			}
			
			
		}

	}


