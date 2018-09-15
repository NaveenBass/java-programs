package nk;

public class ConstructorOverLoading {
	
	public ConstructorOverLoading(int a)
	{
		System.out.println("Area of square: "+(a*a));
	}
	public ConstructorOverLoading(int l,int b)
	{
		System.out.println("Area of rectangle: "+(l*b));
	}
	public ConstructorOverLoading(float k)
	{
		System.out.println("Area of circle: "+(3.14*k*k));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ConstructorOverLoading(2);
		new ConstructorOverLoading(2,4);
		new ConstructorOverLoading(4.5f);
	}

}
