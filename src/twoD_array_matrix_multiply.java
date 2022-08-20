import java.util.*;
public class twoD_array_matrix_multiply {

	public static void main(String[] args) {
		
		int [][] a=new int[10][10];
		int [][] b=new int[10][10];
		int [][] c=new int[10][10];
		int r1,c1,i,j,k;
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter row and coloum");
		r1=obj.nextInt();
		c1=obj.nextInt();
		
		System.out.println("Enter A matrix ");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				a[i][j]=obj.nextInt();
			}
		}
		System.out.println("Enter B matrix");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				b[i][j]=obj.nextInt();
			}
		}
		System.out.println("multiplication");
		for(i=0;i<r1;i++)	
		{
			for(j=0;j<c1;j++)
			{
				c[i][j]=0;
				for(k=0;k<r1;k++)
					c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
				System.out.print("\t" +c[i][j]);
		    }
			System.out.print("\n");
	    } 
}
}