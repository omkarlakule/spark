import java.util.Scanner;
		


		public class area_of_circle {

			public static void main(String[] args) {
				// TODO Auto-generated method stub

				int r;
				double pi=3.14,area;
				
				Scanner s=new Scanner(System.in);
				
				System.out.println("enter radious of circle");
				
				r=s.nextInt();
				
				area=pi*r*r;
				System.out.println("area of circle"+area);
				
				
			}

		}


	
