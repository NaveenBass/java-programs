package nk;
import java.util.*;
class My
{
	 int a,b,c;
	void Addition(int a,int b) {
		c=a+b;
		System.out.println("Answer in class My: "+c);
	}
}
class You extends My
{
	void Subtraction(int a,int b) {
		c=a-b;
		System.out.println("Answer in class You: "+c);
	}
}
class We extends You
{
	public void Multiple(int a,int b) {
		c=a*b;
		System.out.println("Answer in class We: "+c);
		
	}
}
class InH3
{
	public static void main(String args[])
	{
		int a,b;
		Scanner scan=new Scanner(System.in);
		We ob=new We();
		System.out.println("Enter a & b: ");
		a=scan.nextInt();
		b=scan.nextInt();
		ob.Multiple(a,b);
		ob.Subtraction(a,b);
		ob.Addition(a,b);
	}
}