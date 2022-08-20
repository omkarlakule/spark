
public class nonstatic {

	static int x=10;
	int y=15;
	
	public void increment()
	{
		x++;
		y++;
		
	}
	
	public static void main(String[] args) {
	
		nonstatic.x=10;
		
		System.out.println(nonstatic.x);
		
		nonstatic obj1=new nonstatic();
		obj1.increment();
		
	}

}
 