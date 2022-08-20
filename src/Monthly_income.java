import java.util.Scanner;

public class Monthly_income {

	public static void main(String[] args) {
	     
		double mi;
		int s,com;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total sale of a person= ");
		s=sc.nextInt();
		
		if(s>50000)
		{
		    com=16%s;
			mi=375+com;
			System.out.println("Monthly sale income of a person = "+mi);
		}
		else if(s<50000 && s>=40000)
		{
			com=14%s;
			mi=370+com;
			System.out.println("Monthly sale income of a person = "+mi);
		}
		else if(s<40000 && s>=30000)
		{
			com=12%s;
			mi=325+com;
			System.out.println("Monthly sale income of a person = "+mi);
		}
		else if(s<30000 && s>=20000)
		{
			com=9%s;
			mi=300+com;
			System.out.println("Monthly sale income of a person = "+mi);
		}
		else if(s<20000 && s>=10000)
		{
			com=5%s;
			mi=250+com;
			System.out.println("Monthly sale income of a person = "+mi);
		}
		else if(s<10000)
		{
			com=3%s;
			mi=200+com;
			System.out.println("Monthly sale income of a person = "+mi);
		}
		else
		{
			System.out.println("Enter valid output");
		}
	}

}