import java.util.*;
public class array1 {

	public static void main(String[] args) {
		
		int[] a=new int[5];
		int i;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter array elements");
		for(i=0;i<=4;i++)
		{
			a[i]=obj.nextInt();
			
		}
		System.out.println("Display elements :");
		for(i=0;i<=4;i++)
		{
			System.out.println("\t "+a[i]);
		}

	}

}
