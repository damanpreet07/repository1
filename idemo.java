import java.util.*;
class idemo
{
	public static void main(String arg[])
	{
	String name;
	int rollno;
	double marks;
	long pin;
	int a=10;
	System.out.println("hello world: "+a);
	System.out.println("Enter the name, rollno,marks and pin: ");
	Scanner sc;
	sc=new Scanner(System.in);
	name=sc.next();
	rollno=sc.nextInt();
	marks=sc.nextDouble();
	pin=sc.nextLong();
	
	System.out.println("Name is: "+name);
	System.out.println("Name is: "+rollno);
	System.out.println("Name is: "+marks);
	System.out.println("Name is: "+pin);
	}
	}