package naveen;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.*;
import javax.swing.JTextArea;
import java.awt.*;
public class DialogueBox1 implements ActionListener{

	private JFrame frame;
	int ans;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogueBox1 window = new DialogueBox1();
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
	public DialogueBox1() {
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
		
		JButton click = new JButton("click");
		click.setBounds(150, 171, 153, 23);
		frame.getContentPane().add(click);
		
		JTextArea textArea = new JTextArea("welcome to checkup dialoguebox tutorial\nplease click button");
		textArea.setBounds(60, 48, 347, 100);
	
		frame.getContentPane().add(textArea);
		
		textField = new JTextField();
		textField.setBounds(59, 17, 348, 20);
		textField.setBackground(Color.GREEN);
		textField.setForeground(Color.RED);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		click.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		int ans=JOptionPane.showConfirmDialog(null, "Are You Want To Exit");

		System.out.println(ans);		
	}
}
