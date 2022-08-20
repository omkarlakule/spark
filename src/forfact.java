

	import java.util.Scanner;


	public class forfact {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			int i,n,fact=1;
			Scanner obj=new Scanner(System.in);
			System.out.println("enter fact number=");
			n=obj.nextInt();
			
			for(i=1;i<=n;i++)
				
			fact=fact*i;
			
			System.out.println("fact="+fact);
		}

	}


