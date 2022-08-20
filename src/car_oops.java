import java.util.*;
class vehicle
{
  private
  
  String carname;
  int carnumber;
  
  
  public
  void accept()
  {
	  Scanner obj=new Scanner(System.in);
	  System.out.println("Enter car name");
	  carname=obj.next();
	  
	 System.out.println("Enter car number");
	 carnumber=obj.nextInt();
  }
  void display()
  {
	  System.out.println("carname="+carname);
	  System.out.println("crnumber="+carnumber);
  }
}
public class car_oops {
	

	public static void main(String[] args) {
		
		vehicle v1=new vehicle();
		v1.accept();
		v1.display();
    
	}

}
