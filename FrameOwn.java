package naveen;

import javax.swing.JFrame;

public class FrameOwn extends JFrame {

	/**
	 * 
	 */
	
	public FrameOwn() //is a constructor
	{
		
	}
	
	public static void main(String[] args) {
			JFrame obj=new FrameOwn(); //here calling the constructor through object creation
			obj.setSize(500, 700);
			obj.setVisible(true);
			
	}

}
