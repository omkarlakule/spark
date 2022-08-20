import java.util.*;
class stud {

        private 
		int rollno;
		String name;
		double marks;
		
		public 
		void accept()
		{
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter roll no");
			rollno=obj.nextInt();
			
			System.out.println("Enter name");
			name=obj.next();
			
			System.out.println("Enter marks");
			marks=obj.nextDouble();
		}
		
		void display()
		{
			System.out.println("roll no="+rollno);
			System.out.println("name="+name);
			System.out.println("marks="+marks);
		}
		
		
	}
   
	
public class Student_oops {
		public static void main(String[] args)
		{
			stud s1=new stud();
			s1.accept();
			s1.display();
		}
	}

