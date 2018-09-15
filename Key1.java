package naveen;
//<applet code="Key1.class" width="800"height="800"></applet>
import java.awt.event.*;
import java.applet.*;
import java.awt.*;

public class Key1 extends Applet implements KeyListener
{
	
	Label l1,l2;
	TextField t1,t2;	
	
	public void init()
	{
	setLayout(null);
	
	l1=new Label("Enter your Name:");
	l2=new Label("Enter Your Age:");
	t1=new TextField(25);
	t2=new TextField(25);
	


	l1.setBounds(100,100,100,30);
	l2.setBounds(100,150,100,30);
	t1.setBounds(210,100,100,30);
	t2.setBounds(210,150,100,30);
		
	add(l1);add(l2);
	add(t1);add(t2);

	t1.addKeyListener(this);		
	t2.addKeyListener(this);
	}
	public void keyPressed(KeyEvent ke)
	{

	}
	public void keyReleased(KeyEvent ke)
	{
		if(ke.getSource()==t1)
		{
		if(!((ke.getKeyChar()>='A') && (ke.getKeyChar()<='Z')))
		t1.setText(" ");
		}
		else
		{
		if(!((ke.getKeyChar()>='0') && (ke.getKeyChar()<='9')))
		t2.setText(" ");
		}
		
	}
	public void keyTyped(KeyEvent ke)
	{
		
		if(ke.getSource()==t1)
		{
		if(!((ke.getKeyChar()>='A') && (ke.getKeyChar()<='Z')))
		t1.setText(" ");
		}
		else
		{
		if(!((ke.getKeyChar()>='0') && (ke.getKeyChar()<='9')))
		t2.setText(" ");
		}
	}
}		



