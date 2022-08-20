import java.util.*;

public class notes {

	public static void main(String[] args) {
	
		int amt;
		int note[]= {2000,500,200,100,50,20,10,5,1};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount= ");
		amt=sc.nextInt();
		for(int i=0;i<9;i++)
		{
			System.out.println("Number of" +note[i]+ "notes= "+amt/note[i]);
			
			amt=amt%note[i];
			
		}
		

	}

}