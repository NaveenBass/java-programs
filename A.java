package nk;

class father
{
   protected int a=100;
	 protected void display()
	{
		System.out.println("base class father");
	}
	
}
class son extends father 
{
	
	public void display()
	{
	System.out.println(" Derive class son taken a from base  "+a);
	super.display();
	}
}
		
class A
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		son ob=new son();
		ob.display();
		System.out.print(ob.a);
	 
	}

}
