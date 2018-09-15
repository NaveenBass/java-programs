package naveen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class NavinSwing {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NavinSwing window = new NavinSwing();
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
	public NavinSwing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEnterYourName = new JLabel("Enter Your Name");
		lblEnterYourName.setBounds(67, 108, 117, 14);
		frame.getContentPane().add(lblEnterYourName);
		
		textField = new JTextField();
		textField.setBounds(173, 105, 132, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnClickeme = new JButton("ClickeMe");
		btnClickeme.setBounds(133, 160, 89, 23);
		frame.getContentPane().add(btnClickeme);
	}
}
