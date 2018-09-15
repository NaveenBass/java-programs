package naveen;
//<applet code="AppletAE.class" width="800" height="800"></applet>
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class AppletAE extends Applet implements ActionListener
{
	Label l1,l2,l3,l4;
	TextField t1,t2,t3;
	Button b1,b2,b3,b4;
	Choice d,m,y;
	int n1,n2,n3;
	Font f1;
	public void init()
	{
	setLayout(null);
	l1=new Label("Enter Number one");
	l2=new Label("Enter Number two");
	l3=new Label("Answer");
	l4=new Label("Calculator");
	t1=new TextField(10);
	t2=new TextField(10);
	t3=new TextField(10);
	b1=new Button("additon");
	b2=new Button("subtraction");
	b3=new Button("divide");
	b4=new Button("mutliple");
	f1=new Font("REN",Font.BOLD,40);
	l4.setBounds(200,30,200,50);
	l1.setBounds(100,100,130,30);
	t1.setBounds(250,100,50,30);
	l2.setBounds(100,150,130,30);
	t2.setBounds(250,150,50,30);
	b1.setBounds(100,200,90,30);
	b2.setBounds(200,200,90,30);
	b3.setBounds(300,200,90,30);
	b4.setBounds(400,200,90,30);
	l3.setBounds(100,300,60,30);
	t3.setBounds(180,300,50,30);
	t1.setForeground(Color.GREEN);
	t2.setForeground(Color.GREEN);
	t3.setForeground(Color.RED);
	l4.setForeground(Color.PINK);
	l4.setFont(f1);
	add(l1);add(l2);add(l3);add(l4);add(t1);add(t2);add(t3);add(b1);add(b2);add(b3);add(b4);
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent obj2)
	{
	n1=Integer.parseInt(t1.getText());
	n2=Integer.parseInt(t2.getText());
	if(obj2.getSource()==b1)
	n3=n1+n2;
	if(obj2.getSource()==b2)
	n3=n1-n2;
	if(obj2.getSource()==b3)
	n3=n1/n2;
	if(obj2.getSource()==b4)
	n3=n1*n2;
	t3.setText(String.valueOf(n3));











	}
}