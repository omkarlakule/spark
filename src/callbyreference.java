
public class callbyreference {
	int x=10;
	int y=20;
	public void callbyref(callbyreference t)
	{
		t.x=100;
		t.y=50;
		
	}
	

	public static void main(String[] args) {
	
		callbyreference ts=new callbyreference();
		System.out.println("before"+ts.x+" "+ts.y);
		ts.callbyref(ts);
		System.out.println("After"+ts.x+" "+ts.y);
	}
}