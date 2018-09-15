package naveen;
//<applet code="AppletItemLis.class" width="800"height="800"></applet>
import java.awt.event.*;
import java.applet.*;
import java.awt.*;

public class AppletItemLis extends Applet implements ItemListener
{
	Choice c1;
	Label l1;
	List f1;
	String text="";
	public void init()
	{
	setLayout(null);
	c1=new Choice();
	l1=new Label("Text");
	f1=new List(20);
	f1.add("RRRRRR");
	f1.add("qqqq");
	f1.add("wwww");
	f1.add("rrrrrr");
	f1.add("yyyy");
	f1.add("uuuu");
	c1.setBounds(100,100,100,30);
	l1.setBounds(100,200,100,30);
	f1.setBounds(100,300,100,50);
	c1.add("qqqq");
	c1.add("wwww");
	c1.add("rrrrrr");
	c1.add("yyyy");
	c1.add("uuuu");
	add(f1);add(c1);add(l1);

	c1.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent obj)
	{
	text=c1.getSelectedItem();
	l1.setText(text);
	}
}		



