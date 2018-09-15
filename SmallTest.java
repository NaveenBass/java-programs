//<applet code="SmallTest.class" width="500" height="500"></applet>

import java.applet.*;
import java.awt.*;

public class SmallTest extends Applet
{
  public void init()
  {
	setLayout(null);
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

Label l2=new Label("Contact Information");

Font f1=new Font("Arial",Font.BOLD,30);

l2.setFont(f1);
t1.setEchoChar('&');
male.setBackground(Color.BLUE);
setBackground(Color.YELLOW);
l1.setForeground(Color.GREEN);
b1.setBackground(Color.RED);
l2.setBounds(250,50,300,50);
l1.setBounds(100,100,200,30);
t1.setBounds(300,100,200,30);
b1.setBounds(300,150,100,30);
c1.setBounds(300,200,50,30);
c2.setBounds(350,200,50,30);
c3.setBounds(400,200,50,30);
male.setBounds(300,250,50,30);
female.setBounds(370,250,60,30);
others.setBounds(440,250,60,30);
d.setBounds(300,300,50,30);
m.setBounds(370,300,50,30);
y.setBounds(440,300,70,30);

add(l2);
add(l1);
add(t1);
add(b1);
add(c1);add(c2);add(c3);
add(male);add(female);add(others);
add(d);add(m);add(y);
}
}