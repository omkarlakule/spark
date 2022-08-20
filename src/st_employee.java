
public class st_employee {
	int eid;
	String ename;
	static String company_name="Spark";

	public 
	void show()
	{
		System.out.println(eid+ " "+ename+ " "+company_name);
	}
	public static void main(String[] args) {
	
		st_employee se1=new st_employee();
		se1.eid=104;
		se1.ename="sameer";
		se1.show();
		
		st_employee se2=new st_employee();
		se2.eid=110;
		se2.ename="amruta";
		se2.show();
		
	}
}
