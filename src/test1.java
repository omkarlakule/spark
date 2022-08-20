
public class test1 {

	static int x=50;
	int y=60;
	void increment()
	{
		x++;
		y++;
	}
	
	public static void main(String[] args)
	{
		
	test1 t1=new test1();
	test1 t2=new test1();
	
	System.out.println(test1.x);
	System.out.println(t2.y);
	
	t1.increment();
	t2.increment();

	System.out.println(test1.x);
	System.out.println(t2.y);
	}

}