package naveen;
//<applet code="AppletIL2.class" width="800"height="800"></applet>
import java.awt.event.*;
import java.applet.*;
import java.awt.*;

public class AppletIL2 extends Applet implements ItemListener
{
	Choice d,m,y;
	Label l1,l2;
	List f1;
	int i;
	Font fo;
	String text1="",text2="",text3="",text4="";
	public void init()
	{
	setLayout(null);
	d=new Choice();
	m=new Choice();
	y=new Choice();
	for(i=1;i<=31;i++)
	d.addItem(String.valueOf(i));
	for(i=1;i<=12;i++)
	m.addItem(String.valueOf(i));
	for(i=1995;i<=2013;i++)
	y.addItem(String.valueOf(i));
	l1=new Label("Text");
	l2=new Label("dd/mm/yy:");
	f1=new List(20);
	fo=new Font("Elephant",Font.BOLD,12);
/*	f1.add("RRRRRR");
	f1.add("qqqq");
	f1.add("wwww");
	f1.add("rrrrrr");
	f1.add("yyyy");
	f1.add("uuuu"); */
	d.setBounds(100,100,50,30);
	m.setBounds(170,100,50,30);
	y.setBounds(230,100,100,30);	
	l2.setFont(fo);
	l1.setFont(fo);
	l1.setBounds(200,150,100,30);
	l2.setBounds(100,150,100,30);
	l1.setForeground(Color.RED);
		
//	f1.setBounds(100,300,100,50);
	add(f1);add(l1);add(l2);
	add(d);add(m);add(y);

	d.addItemListener(this);
	m.addItemListener(this);
	y.addItemListener(this);		
	}
	public void itemStateChanged(ItemEvent obj)
	{
	text1=d.getSelectedItem();
	text2=m.getSelectedItem();
	text3=y.getSelectedItem();
	text4=text1+" / "+text2+" / "+text3;
	l1.setText(text4);
	}
}		



