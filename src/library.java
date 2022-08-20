class library1
{
	String bname;
	String author;
	int price;

  public library1()
  {
	  bname=" ";
	  author=" ";
	  price=0;
  }
  library1(String a,String b,int n)
  {
	  bname=a;
	  author=b;
	  price=n;
  }
  library1(String a,int n)
  {
	  this.bname=bname;
	  this.price=price;
  }
  library1(library1 ckt)
  {
	  bname=ckt.bname;
	  price=ckt.price;
  }
  public String toString()
  {
	  return "bname="+bname+"author="+author+"price="+price;
  }
}
public class library {

	public static void main(String[] args) {
		library1 c1=new library1();
		library1 c2=new library1("zero ","madgulkar",450);
		library1 c3=new library1(c2);
		library1 c4=new library1("zero",500);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		c1.bname="shershivraj ";
		c1.author="vk patil ";
		c1.price=300;
		System.out.println(c1);
        
		System.out.println(c1);
	}
		

	}


