package nk;
import java.util.Scanner;
public class Oops2Run {

	int a,b,c;
	int argspassab(int a,int b)
	{
		c=a+b;
		return c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oops2Run obj=new Oops2Run();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter A & B values: ");
		obj.a=scan.nextInt();
		obj.b=scan.nextInt();
		int ans=obj.argspassab(obj.a,obj.b);
		System.out.println(" "+ans);
		
	}

}
