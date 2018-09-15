package naveen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.*;
import java.awt.*;

public class NewWindow1 extends JFrame implements ActionListener {

	/**
	 * 
	 */
	JFrame frmSecondFormWindow;
		
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewWindow1 window = new NewWindow1();
					window.frmSecondFormWindow.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NewWindow1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSecondFormWindow = new JFrame();
		frmSecondFormWindow.setBounds(100, 100, 450, 300);
		frmSecondFormWindow.getContentPane().setLayout(null);
		
		JButton btnClick = new JButton("click");
		btnClick.setBounds(43, 143, 326, 50);
		frmSecondFormWindow.getContentPane().add(btnClick);
		
		JTextArea textArea = new JTextArea("Do You open \n A New Window\nPress Click");
		textArea.setBounds(139, 28, 119, 77);
		frmSecondFormWindow.getContentPane().add(textArea);
	
		btnClick.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		frmSecondFormWindow.setVisible(false);
		JFrame obj=new FrameOwn();
		obj.setSize(500, 700);
		obj.setVisible(true);
	}

}
