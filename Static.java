package naveen;
class Abc
{
	static int a=10; //static variable declaration
	int b=20;	//normal variable declaration
	void display() //can access static & normal variable in normal method
	{
		// static int z=400;//static variable can not declare inside the static & normal methods
		int c=100;//normal variable only can declare inside the method
		System.out.println("class Abc Answer: "+ (++a));//need not bracket for one variable
		System.out.println("class Abc Answer: "+ (++b));
		System.out.println("class Abc Answer: "+ ++c);
	}
}
public class Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc $=new Abc();
		$.display();
		$.display();
		$.display();
		$.display();
		
	}

}
