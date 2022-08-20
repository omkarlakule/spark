
	class cricketer
	{
		String name;
		String team;
		int age;
		
		public 
		cricketer()
		{
			name=" ";
			team=" ";
			age=0;
		}
		cricketer(String n,String t,int a)
		{
			name=n;
			team=t;
			age=a;
			
		}
		cricketer(String name,int age)
		{
			this.name=name;
			this.age=age;
			
		}
		cricketer(cricketer ckt)
		{
			name=ckt.name;
			team=ckt.team;
			age=ckt.age;
		}
		public String toString()
		{
			return "name= "+name+ "team="+team+ "age= "+age;
		}
	}
	
	public class constructor {


	public static void main(String[] args) {
		
		cricketer c1=new cricketer();
		cricketer c2=new cricketer("sachin ","india ",32);
		cricketer c3=new cricketer(c2);
		cricketer c4=new cricketer("Dhoni",55);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		c1.name="Sehwag ";
		c1.team="india ";
		c1.age=40;
        
		System.out.println(c1);
	}
}
