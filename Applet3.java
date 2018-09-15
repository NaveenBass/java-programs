//<applet code="Applet3.class" width="800" "height="800"></applet>
import java.applet.*;
import java.awt.*;


public class Applet3 extends Applet
{
	public void init()
	{
	setLayout(null);
	Label l1=new Label("Enter Your Name");
	l1.setBounds(100,100,200,20);
	add(l1);
	TextField t1=new TextField(30);
	t1.setBounds(330,100,150,20);
	add(t1);
	Button b1=new Button("Enter Here");
	b1.setBounds(500,100,100,20);
	add(b1);
	Checkbox c1=new Checkbox("SSLC");
	c1.setBounds(100,150,50,50);
	add(c1);
	Checkbox c2=new Checkbox("HSC");
	c2.setBounds(170,150,50,50);
	add(c2);
	Checkbox c3=new Checkbox("UG");
	c3.setBounds(240,150,50,50);
	add(c3);
	Checkbox c4=new Checkbox("PG");
	c4.setBounds(290,150,50,50);
	add(c4);
	CheckboxGroup obj=new CheckboxGroup();
	Checkbox male=new Checkbox("male",obj,true);
	male.setBounds(100,240,60,50);
	add(male);//all true nothing change output but when all false be output change
	Checkbox female=new Checkbox("female",obj,false);
	female.setBounds(160,240,70,50);
	add(female);
	Checkbox others=new Checkbox("others",obj,false);
	others.setBounds(250,240,70,50);
	add(others);
	Choice d=new Choice();
	Choice m=new Choice();
	Choice y=new Choice();
	for(int i=1;i<=31;i++)
	d.addItem(String.valueOf(i));
	for(int j=1;j<=12;j++)
	m.addItem(String.valueOf(j));
	for(int k=1990;k<=2013;k++)
	y.addItem(String.valueOf(k));
	d.setBounds(100,300,70,70);
	m.setBounds(200,300,70,70);
	y.setBounds(300,300,70,70);
	add(d);add(m);add(y);
	List l2=new List(5); //list of some thing one table
	l2.setBounds(100,360,100,100);	
	l2.add("C");
	l2.add("c++");
	l2.add("java");
	l2.add("net");l2.add("WWWWWWW");l2.add("UUUU");l2.add("EEEEEEEE");

	add(l2);	
	l1.setBackground(Color.BLUE);	//for change letters background color
	t1.setBackground(Color.ORANGE);
	b1.setBackground(Color.RED);
	male.setBackground(Color.GREEN);

	d.setForeground(Color.RED);  //for change letters color
	female.setForeground(Color.GREEN);
	Font f1=new Font("Arial",Font.BOLD,20);//change letter font style 
	l1.setFont(f1);		              // syntax=(Font obj=new Font ("Style of Font"[eg:"Arial"],Font.BOLD,20[size of font])
	t1.setEchoChar('&');//like password typing eg:****,$$$$,@@@@@ etc.
	
		
	}
}