import java.util.*;
class area
{
	private 
	int len,bre,area;
	
	public
	void accept()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter len");
		len=obj.nextInt();
		
		System.out.println("Enter bre");
		bre=obj.nextInt();
	}
	void calculate()
	{
		area=len*bre;
		System.out.println("area="+area);
	}
}
public class Rectangle_oops {

	public static void main(String[] args) {
		
	/*	area a1=new area();
		a1.accept();
		a1.calculate(); */
		
		area [] a=new area[3];
		
		int i;
		for(i=0;i<=2;i++)
		{
			a[i]=new area();
			
		}
		for(i=0;i<=2;i++)
		{
			a[i].accept();
		}
		for(i=0;i<=2;i++)
		{
			a[i].calculate();
		}
	}
}