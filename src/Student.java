import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
      
		double held,attend,per;
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of classes held= ");
		held=sc.nextDouble();
		System.out.println("number of classes attends= ");
		attend=sc.nextDouble();
		per=(attend/held)*100;
		System.out.println("percentage="+per);
		
		if(per>75)
		{
			System.out.println("Student is allowed to sit in exam");
		}
		else
		{
			System.out.println("Student is not allowed to sit exam");
		}

	}

}
