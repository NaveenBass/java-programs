package naveen;
//<applet code="Applet2.class" width="500" "height="300"></applet>
import java.applet.*;
import java.awt.*;

public class Applet2 extends Applet
{
	public void init()
	{
	Label l1=new Label("Enter Your Name: ");add(l1);
	TextField t1=new TextField(30);add(t1);
	Checkbox c1=new Checkbox("SSLC");add(c1);
	Checkbox c2=new Checkbox("HSC");add(c2);
	Checkbox c3=new Checkbox("UG");add(c3);
	Checkbox c4=new Checkbox("PG");add(c4);
	Button b1=new Button("Enter Here");add(b1);
	CheckboxGroup obj=new CheckboxGroup();
	Checkbox male=new Checkbox("male",obj,true);add(male);//all true nothing change output but when all false be output change
	Checkbox female=new Checkbox("female",obj,false);add(female);
	Checkbox others=new Checkbox("others",obj,false);add(others);
	Choice d=new Choice();
	Choice m=new Choice();
	Choice y=new Choice();
	for(int i=1;i<=31;i++)
	d.addItem(String.valueOf(i));
	for(int j=1;j<=12;j++)
	m.addItem(String.valueOf(j));
	for(int k=1990;k<=2013;k++)
	y.addItem(String.valueOf(k));
	add(d);add(m);add(y);
	
	
	}
}