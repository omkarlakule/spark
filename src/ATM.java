import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
	
		int ba,db,cd;
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter balance= ");
		ba=sc.nextInt();
		do
		{
			System.out.println("enter your choice=");
			ch=sc.next().charAt(0);
		
		switch (ch)
		{
		case '1':
			     System.out.println("debit amount= ");
			     db=sc.nextInt();
			     
			     ba-=db;
			     System.out.println("New balance= "+ba);
			     break;
			     
		case '2' :
			    
			     System.out.println("Credit amount= ");
			     cd=sc.nextInt();
			     
			     ba+=cd;
			     System.out.println("New Balance= "+ba);
			     break;
			     
		case '3' :
			System.exit(0);
			break;
			
		default :
			System.out.println("wrong choice");
			
			
			
			
		}
		
		}
		while(ch!='3');
	}

}
