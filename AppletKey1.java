package naveen;
//<applet code="AppletKey1.class" width="500" "height="300"></applet>
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class AppletKey1 extends Applet implements KeyListener
{

	Label l1,l2;
	TextField t1,t2;

	public void init()
	{
	setLayout(null);
	l1=new Label("Enter Your Name");
	l2=new Label("Enter Your Age");
	t1=new TextField(23);
	t2=new TextField(33);
	l1.setBounds(100,100,100,30);
	t1.setBounds(200,100,100,30);
	l2.setBounds(100,200,100,30);
	t2.setBounds(200,200,100,30);
	add(t1);add(t2);add(l1);add(l2);
	t1.addKeyListener(this);
	t2.addKeyListener(this);
	}
	public void keyPressed(KeyEvent obj)
	{
        
	 
	}	
	public void keyReleased(KeyEvent obj)
	{
	if(obj.getSource()==t1)
	{
	if(!((obj.getKeyChar()>='A') && (obj.getKeyChar()<='Z') || (obj.getKeyChar()==' ')))
	t1.setText(" ");
	}
	else
	{
	if(!((obj.getKeyChar()>='0') && (obj.getKeyChar()<='9') || (obj.getKeyChar()==' ')))
	t2.setText(" ");
	}
	}
	public void keyTyped(KeyEvent obj)
	{
	if(obj.getSource()==t1)
	{
	if(!((obj.getKeyChar()>='A') && (obj.getKeyChar()<='Z') || (obj.getKeyChar()==' ')))
	t1.setText(" ");
	}
	else
	{
	if(!((obj.getKeyChar()>='0') && (obj.getKeyChar()<='9') || (obj.getKeyChar()==' ')))
	t2.setText(" ");
	}
	}
	
}