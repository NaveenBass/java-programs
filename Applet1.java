package naveen;
//<applet code="Applet1.class" width="400" height="600"></applet>

import java.applet.*;
import java.awt.*;
public class Applet1 extends Applet
{
	public void init()
	{
	Label l1=new Label ("Enter Your Name ");
	TextField t1=new TextField(13);
	add(l1);
	add(t1);
	Button b1=new Button("\nclick");
	add(b1);
	Checkbox c1=new Checkbox("SSLC");
	Checkbox c2=new Checkbox("HSC");
	Checkbox c3=new Checkbox("Degree");
	add(c1);add(c2);add(c3);
	
	}
}