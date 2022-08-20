import java.util.*;
public class Numbers {

public static void main(String []args)

{

Scanner sc=new Scanner(System.in);

System.out.println("Enter 10 numbers");

int a[] ={0,1,2,3,4};

for(int i=1;i<=10;i++)

{

int n=sc.nextInt();

if(n>0)

a[0]=a[0]+1;

if(n<0)

a[1]=a[1]+1;

if(n==0)

a[4]=a[4]+1;

if(n%2==1)

a[2]=a[2]+1;

else

a[3]=a[3]+1;

}

System.out.println("positive number "+a[0]);

System.out.println("negative number "+a[1]);

System.out.println("odd number "+a[2]);

System.out.println("even number "+a[3]);

System.out.println("zero "+a[4]);

}

}