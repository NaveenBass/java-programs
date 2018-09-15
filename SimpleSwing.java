package naveen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.*;
import javax.swing.AbstractAction;
import javax.swing.Action;
public class SimpleSwing implements ActionListener,KeyListener {
	JLabel lblEnterYourName;
	private JFrame frame;
	String a="";
	private JTextField textField;
	private final Action action = new SwingAction();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleSwing window = new SimpleSwing();
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
	public SimpleSwing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField = new JTextField();
		frame.getContentPane().add(textField, BorderLayout.CENTER);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(151, 97, 202, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.addKeyListener(this);
		
		lblEnterYourName = new JLabel("Enter Your Name");
		lblEnterYourName.setBounds(10, 100, 131, 14);
		frame.getContentPane().add(lblEnterYourName);
		
		JButton btnClickme = new JButton("Clickme");
		btnClickme.setBounds(151, 211, 202, 23);
		frame.getContentPane().add(btnClickme);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setAction(action);
		btnNewButton.setBounds(151, 165, 202, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnGetvalue = new JButton("getVal");
		btnGetvalue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null,"Enter input value");
				a=JOptionPane.showInputDialog(null,"Enter a value");
				
			}
		});
		btnGetvalue.setBounds(151, 41, 89, 23);
		frame.getContentPane().add(btnGetvalue);
		btnClickme.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
textField.setText(a);		
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			textField.setText("show me");
		}
	}
	public void keyPressed(KeyEvent ke)
	{
		
	}
	public void keyReleased(KeyEvent ke)
	{
		
		textField.setText(a);		
	}
	public void keyTyped(KeyEvent ke)
	{
		
		if(ke.getKeyChar()>='a' && ke.getKeyChar()<='z')
		a=a+ke.getKeyChar();
		else
			textField.setText(" ");
		

	}
}

