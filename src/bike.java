
public class bike {



	    int speedlimit=80;
		public void run()
		{
			speedlimit=450;
			System.out.println("speedlimit="+speedlimit);
		}
		public static void main(String[] args) {
			
			bike b=new bike();
			b.run();
	}

}
