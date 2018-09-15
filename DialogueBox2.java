package naveen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JTextField;
import javax.swing.JButton;

public class DialogueBox2 implements ActionListener{
	JButton btnClick;
	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogueBox2 window = new DialogueBox2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DialogueBox2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(135, 43, 171, 64);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		btnClick = new JButton("click");
		btnClick.setBounds(135, 129, 171, 37);
		frame.getContentPane().add(btnClick);
		btnClick.addActionListener(this);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int ans=JOptionPane.showConfirmDialog(null, "Are You (WANT CLOSE)");
		if(ans==0) //when we press Dialogurbox1 prgm Yes=0,No=1,Cancle=2
		{
			textField.setVisible(false);
		}
		if(ans==1)
			textField.setBackground(Color.blue);
		if(ans==2)
			textField.setVisible(true);
			
	}

}
