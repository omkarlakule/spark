
public class large_small_no {

		public static void main(String[] args) {
		 
		int a[] = new int[]{1,2,3,4,5,6,7,8,9,10};
		 
		
		int smallest = a[0];
		int largest = a[0];

		 
		for(int i=1; i< a.length; i++)
		{
		if(a[i] > largest)
		largest = a[i];
		else if (a[i] < smallest)
		smallest = a[i];
		 
		}
		System.out.println("Smallest Number " + smallest);
		System.out.println("Largest Number " + largest);
		}
	}