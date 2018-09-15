package nk;

public class ConstructorArg 
{
	int a,b,c;
	public ConstructorArg()
	{
		a=30;
		b=10;
		c=20;
		
	}
	public ConstructorArg(int x,int y,int c)
	{
		a=x;
		b=y;
		this.c=c;
	}
	void dis()
	{
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		System.out.println("c= "+c);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ConstructorArg ob1=new ConstructorArg();
		ConstructorArg ob2=new ConstructorArg(12,11,122);
		ob1.dis();
		ob2.dis();
		
		
	}

}
