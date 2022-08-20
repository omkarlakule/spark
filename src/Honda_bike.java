
public class Honda_bike {

class bike1
{
	public 
	void run()
	{
		System.out.println("running");
	}
}
class Honda_bike extends bike1
{
	void run()
	{
		System.out.println("running safely with 100 kmph");
	}

	public static void main(String[] args)
	{
	
		Honda_bike h1=new Honda_bike();
		h1.run();
	}

}
}

