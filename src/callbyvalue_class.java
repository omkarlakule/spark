
public class callbyvalue_class {



		public void callbyval(int x)
		{
			x=100;
		}
		public static void main(String[] args) {
			int x=50;
			callbyvalue_class c1=new callbyvalue_class();
			c1.callbyval(x);
			System.out.println(x);
	}

}
