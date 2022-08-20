import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		
		char sex,ms;
		int age;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter driver's marital status(M/U)");
		ms=sc.next().charAt(0);
		System.out.println("Enter driver's sex(M/F)");
		sex=sc.next().charAt(0);
		System.out.println("Enter driver's age");
		age=sc.nextInt();
		
		if(ms=='M')
		{
			System.out.println("Driver is insured");
		}
		else if(ms=='U' && sex=='M' && age>30)
		{
			System.out.println("Driver is insured");
		}
		else if(ms=='U' && sex=='F' && age>25)
		{
			System.out.println("Driver is insured");
		}
		else
		{
			System.out.println("Driver is not insured");
		}
	}
}
