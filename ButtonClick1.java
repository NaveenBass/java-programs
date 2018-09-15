package naveen;
//<applet code="ButtonClick1.class" width="500" height="600"></applet>
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonClick1 extends Applet implements ActionListener {

	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1,b2,b3,b4;
	int n1,n2,n3;
	public void init()
	{
		
		setLayout(null);
		
		
		List ll=new List(10);
		ll.add("welcome");
		ll.add("naveen");
		add(ll);
		
		ll.setBounds(100,400,200,100);
		
		
		l1=new Label("Enter no.1");
		l2=new Label("Enter no.2");
		l3=new Label("Answer");
		t1=new TextField(20);
		t2=new TextField(20);
		t3=new TextField(20);
		b1=new Button("add");
		b2=new Button("sub");
		b3=new Button("mul");
		b4=new Button("div");
		
		l1.setBounds(100, 100, 100, 30);
		l2.setBounds(100, 150, 100, 30);
		l3.setBounds(100, 250, 100, 30);
		t1.setBounds(200, 100, 100, 30);
		t2.setBounds(200, 150, 100, 30);
		t3.setBounds(200, 250, 100, 30);
		b1.setBounds(100, 200, 100, 30);
		b2.setBounds(200, 200, 100, 30);
		b3.setBounds(300, 200, 100, 30);
		b4.setBounds(400, 200, 100, 30);
		
		
		add(l1);add(l2);add(l3);add(t1);add(t2);add(t3);add(b1); add(b2);add(b3);add(b4);
		
           b1.addActionListener(this);
           b2.addActionListener(this);
           b3.addActionListener(this);
           b4.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		n1=Integer.parseInt(t1.getText());
		n2=Integer.parseInt(t2.getText());
		if(ae.getSource()==b1)
		n3=n1+n2;
		if(ae.getSource()==b2)
			n3=n1-n2;
		if (ae.getSource()==b3)
			n3=n1*n2;
		if(ae.getSource()==b4)
			n3=n1/n2;
		t3.setText(String.valueOf(n3));
	}
}

