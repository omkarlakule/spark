
public class calculate_methodoverloading {

	void sum(int a,int b)
	{
		System.out.println("sum is="+(a+b));
	}
	void sum(float a,float b)
	{
		System.out.println("sum is="+(a+b));
	}
	
	public static void main(String[] args) {

	calculate_methodoverloading c1=new calculate_methodoverloading();
	c1.sum(7,8);
	c1.sum(1.2f, 2.4f);
	
	}
}
