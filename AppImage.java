package naveen;

//<applet code="AppImage.class" width="800" height="800"></applet>
import java.io.*;
import javax.imageio.*;
import java.awt.Image.*;
import java.applet.*;
import java.awt.*;

public class AppImage extends Applet
{
	File fm;
	Image img;
	public void init()
	{
		setLayout(null);
	fm=new File("autoo.jpg.png");		
	try
	{
	img=ImageIO.read(fm);
	}
	catch(Exception e)
		{
		}
	}
	public void paint(Graphics g)
	{
	g.drawImage(img,30,40,this);
	}
}
	
