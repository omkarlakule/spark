import java.util.*;
public class array_sort_tostring {

	public static void main(String[] args) {
		
		int[] a=new int[5];
		int i;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter array elements");
		for(i=0;i<=4;i++)
		{
			a[i]=obj.nextInt();
			
		}
		Arrays.sort(a);
	/*	System.out.println("\t" +Arrays.toString(a));*/
		for(i=0;i<=4;i++)
		 {
		  System.out.print("\t" +a[i]);
		 }
		

	}

}
