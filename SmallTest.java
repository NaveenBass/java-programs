package naveen;
//<applet code="SmallTest.class" width="500" height="500"></applet>

import java.applet.*;
import java.awt.*;

public class SmallTest extends Applet
{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void init()
  {
	Label l1=new Label("Enter Your Name:");
	TextField t1=new TextField(10);
	Button b1=new Button("clickme");
	Checkbox c1=new Checkbox("c");
Checkbox c2=new Checkbox("c++");
Checkbox c3=new Checkbox("java");

CheckboxGroup cbg=new CheckboxGroup();
Checkbox male=new Checkbox("Male",cbg,true);
Checkbox female=new Checkbox("Female",cbg,false);
Checkbox others=new Checkbox("Others",cbg,false);

Choice d=new Choice();
Choice m=new Choice();
Choice y=new Choice();
for(int i=1;i<=31;i++)
d.addItem(String.valueOf(i));


m.addItem("jan");
m.addItem("feb");
m.addItem("Mar");

y.addItem("1999");
y.addItem("2000");

add(l1);
add(t1);
add(b1);
add(c1);add(c2);add(c3);
add(male);add(female);add(others);
add(d);add(m);add(y);
}
}