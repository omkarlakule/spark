import java.util.Scanner;

public class employee {

	public static void main(String[] args) {
	
	double salary,bonus,nba;
	int yos;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Salary= ");
	salary=sc.nextDouble();
	System.out.println("Enter year of service= ");
	yos=sc.nextInt();
	
	if(yos>5)
	{
		bonus=salary*5/100;
		nba=bonus+salary;
		System.out.println("Net bonus Salary= "+nba);
		
	}
	else 
	{
		nba=salary;
		System.out.println("Net bonus Salary= "+nba);
	}
		
		
	}

}
