
public class Honda {
class bike1
{
	public 
	void run()
	{
		System.out.println("running");
	}
}
class Honda extends bike1
{
	void run()
	{
		System.out.println("running safely with 100 kmph");
	}

	public static void main(String[] args)
	{
	
		Honda h1=new Honda();
		h1.run();
	}

}
}
