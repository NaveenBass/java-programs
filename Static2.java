package naveen;
class xyz{
	static int a=5,b=10;
	int q=100; //outside normal variable declaration can not access inside the static method 
	static void display()  //static method declaration and static method only can access static variable
	{
		int w=15; //inside normal variable declaration can not access inside the static method
	//	static int c=100;//static variable can not declare also inside the both normal & static class
		System.out.println("class xyz Answer: "+ ++a);
		System.out.println("class xyz Answer: "+ ++b);
		System.out.println("class xyz Answer W: "+ ++w);
	//	System.out.println("class xyz Answer: "+ ++q);
	}
	
}

public class Static2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		xyz $$=new xyz();
		$$.display();
		$$.display();
		$$.display();
		$$.display();
		
	}

}
