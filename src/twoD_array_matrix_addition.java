import java.util.Scanner;

public class twoD_array_matrix_addition {

	public static void main(String[] args) {
	
		int[][] a=new int[3][3];
		int[][] b=new int[3][3];
		int[][] c=new int[3][3];
		int i,j;
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter A matrix");
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
			{
				a[i][j]=obj.nextInt();
			}
		}
		System.out.println("Enter b matrix");
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
			{
	 			b[i][j]=obj.nextInt();
			}
		}
		System.out.println("addition:");
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print("\t "+c[i][j]);
			}
			System.out.print("\n");
		}	
	}
}
