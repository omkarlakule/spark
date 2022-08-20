import java.util.Scanner;

public class Working {

	public static void main(String[] args) {
       
		int age;
		char sex,ms;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter sex= ");
		sex=sc.next().charAt(0);
		
		if(sex=='F')
		{
			System.out.println("she will work only in urban");
			
		}
		else
		{
			System.out.println("Enter age= ");
			age=sc.nextInt();
			
			if(sex=='M' && age>20 && age<=40)
			{
				System.out.println("He will Work anywhere");
			}
			else if(sex=='M' && age>40 && age<=60)
			{
				System.out.println("He will work only in urban");
			}
			else
			{
				System.out.println("Error");
			}
		}
		

	}

}
