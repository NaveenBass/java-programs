package nk;
import java.util.*;
class Ti
{
	protected int speed,distance,time;
	 void very(int speed,int time)
	{
		time=speed*time;
		System.out.println("Time in class time: "+time);
	}
}
class Sp extends Ti
{
	void very(int time,int distance)
	{
		speed=distance+time;
		System.out.println("Speed in class speed: "+speed);
		super.very(speed,time);
	}
}
class Di extends Ti
{
	void very(int speed,int time)
	{
		distance=speed*time;
		System.out.println("Distance in class distance: "+distance);
		super.very(speed, time);
	}
}
public class Hierarchical 
{
		
	public static void main(String[] args) 
	{
	
int a,b;
		Di ob=new Di();
			Sp ob1=new Sp();
			Scanner scan=new Scanner(System.in);
			System.out.println("enter the values :");
			
			a=scan.nextInt();
			b=scan.nextInt();
			ob.very(a,b);
			ob1.very(a,b);
	}

}