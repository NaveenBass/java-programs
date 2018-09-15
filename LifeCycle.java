//<applet code="LifeCycle.class" width="500" height="500"></applet>
package naveen;
import java.applet.*;
import java.awt.*;
public class LifeCycle extends Applet{

	public void init()
	{
		System.out.println("init");
	}
	public void start()
	{
		System.out.println("start");
	}
	public void stop()
	{
		System.out.println("stop");
	}
	public void destroy()
	{
		System.out.println("destroy");
	}
	public void paint(Graphics g)
	{
		System.out.println("paint");
	}
	
	
}
