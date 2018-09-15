package naveen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JTextField;
public class MouseLis1 implements MouseListener,MouseMotionListener {
	JButton Click;
	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MouseLis1 window = new MouseLis1();
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
	public MouseLis1() {
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
		
		Click = new JButton("click");
		Click.setBounds(114, 25, 160, 52);
		frame.getContentPane().add(Click);
		
		textField = new JTextField();
		textField.setBounds(133, 125, 139, 38);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		Click.addMouseListener(this);
		Click.addMouseListener(this);
			}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		textField.setText("Mouse Clicked");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		textField.setText("Mouse Pressed");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		textField.setText("Mouse Released");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		textField.setText("Mouse Entered");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		textField.setText("Mouse Exited");
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		textField.setText("Mouse Dragged");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		textField.setText("Mouse Moved");
	}
}
