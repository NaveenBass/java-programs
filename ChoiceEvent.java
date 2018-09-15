//<applet code="ChoiceEvent" width="900" height="700"></applet>
package naveen;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class ChoiceEvent extends Applet implements ItemListener{
	Choice c1;
	Label l1;
	String text="";
public void init()
{
	setLayout(null);
	l1=new Label("Text");
	c1=new Choice();
	c1.addItem("java");
	c1.addItem("c");
	c1.addItem("vb");
	c1.addItem("sql");
	c1.addItem(".net");
	c1.addItem("html");
	c1.addItem("javascript");
	c1.addItem("vbscript");
	c1.addItem("asp");
	c1.addItem("xml");
	c1.addItem("css");
	c1.addItem("oracle");
	c1.addItem("php");
	c1.addItem("Basic");
	c1.addItem("PAscal");
	c1.addItem("COBOL");
	c1.addItem("c++");
	c1.addItem("TALLY");
	c1.addItem("Objective C");
	c1.addItem("SWIFT");
	c1.addItem("UNIX - Programming");
	c1.addItem("Word,excel,powerpoint,msaccess");
	c1.addItem("Photoshop cs5");
	c1.addItem("Coreldraw x3");
	c1.addItem("flash");
	
	add(c1);
	add(l1);

	c1.setBounds(100,100,200,30);
	l1.setBounds(200,400,100,30);
	
	c1.addItemListener(this);
}	
	


public void itemStateChanged(ItemEvent ie)
{
	text=c1.getSelectedItem();
	l1.setText(text);
}
}
