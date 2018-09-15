package naveen;
//<applet code="ImageApp.class" width="600" height="600"></applet>
import java.awt.*;
import java.awt.image.ImageObserver;
import java.applet.*;


public class ImageApp {
		Toolkit tt=Toolkit.getDefaultToolkit();
		Image img=tt.getImage("we.jpg");
		public void paint(Graphics g){
			g.drawImage(img,100,100,(ImageObserver)this);
		
		}
						

}
