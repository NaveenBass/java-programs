package naveen;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import javax.swing.JPasswordField;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class Ss extends JFrame implements ActionListener,KeyListener,ItemListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JCheckBox chckbxNone,chckbxC,chckbxC_1;
	JList<String> list;
	DefaultListModel<String> dlist;
	JPanel contentPane;
	JButton btnClear;
	JTextField textField;
	JPasswordField textField_1;
	JTextField textField_2;
	JRadioButton rdbtnOthers,rdbtnFemale,rdbtnMale;
	JLabel lblEnterYourName,lblEnterYourPassword,lblEnterYourAge;
	String a="",s1="",s3="",s4="",s5="",s6="";
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton btnSummit;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ss naveen = new Ss();
					naveen.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ss() {
				
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblEnterYourName = new JLabel("Enter Your Name");
		lblEnterYourName.setBounds(28, 38, 92, 32);
		contentPane.add(lblEnterYourName);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				if(arg0.getKeyChar()>='A' && arg0.getKeyChar()<='Z')
					a=a+arg0.getKeyChar();
				else
					textField.setText(" ");
			
	
			}
			@Override
			public void keyReleased(KeyEvent arg0) {
				textField.setText(a);

			}
		});
		textField.setBounds(159, 44, 167, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblEnterYourPassword = new JLabel("Enter Your Password");
		lblEnterYourPassword.setBounds(28, 96, 100, 14);
		contentPane.add(lblEnterYourPassword);
		
		textField_1 = new JPasswordField();
		textField_1.setEchoChar('*');
		
		textField_1.setBounds(159, 93, 167, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblEnterYourAge = new JLabel("Enter Your Age ");
		lblEnterYourAge.setBounds(28, 132, 100, 25);
		contentPane.add(lblEnterYourAge);
		
		textField_2 = new JTextField();
		textField_2.setBounds(159, 134, 45, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(2);
		
		rdbtnMale = new JRadioButton("male");
		buttonGroup.add(rdbtnMale);
		rdbtnMale.setBounds(159, 172, 52, 23);
		contentPane.add(rdbtnMale);
		
		rdbtnFemale = new JRadioButton("female");
		buttonGroup.add(rdbtnFemale);
		rdbtnFemale.setBounds(213, 172, 65, 23);
		contentPane.add(rdbtnFemale);
		
		rdbtnOthers = new JRadioButton("others");
		buttonGroup.add(rdbtnOthers);
		rdbtnOthers.setBounds(275, 172, 109, 23);
		contentPane.add(rdbtnOthers);

		list = new JList<String>();
		dlist=new DefaultListModel<String>();
		list.setModel(dlist);
		list.setBounds(159, 258, 109, 115);
		contentPane.add(list);
	
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(28, 168, 65, 32);
		contentPane.add(lblGender);
		
	    btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			if(arg0.getSource()==btnClear){
				textField.setText(" ");a="";
				textField_1.setText("");
				textField_2.setText(" ");
				dlist.clear();
				rdbtnOthers.setSelected(false);
				rdbtnFemale.setSelected(false);
				rdbtnMale.setSelected(false);
				chckbxC.setSelected(false);
				chckbxC_1.setSelected(false);
				chckbxNone.setSelected(false);
				
			}
			}
			});
		btnClear.setBounds(265, 202, 89, 23);
		contentPane.add(btnClear);
		
			
		btnSummit = new JButton("Summit");
		btnSummit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			if(arg0.getSource()==btnSummit){
				dlist.addElement(textField.getText());
				dlist.addElement(textField_2.getText());
				s1=chckbxC.getText();
				s3=chckbxC_1.getText();
				s4=chckbxNone.getText();
		       	if(chckbxC.isSelected()==true && chckbxC_1.isSelected()==true){	
					dlist.addElement(s1);
		       		dlist.addElement(s3);
		       	
		       	}
		       	if(chckbxNone.isSelected()==true){
		       			dlist.addElement(s4);	
		       		}
		       		
		       	}
			}

			}
		);
		btnSummit.setBounds(159, 202, 89, 23);
		contentPane.add(btnSummit);
		
		chckbxC = new JCheckBox("c");
		chckbxC.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				
					if(chckbxNone.isSelected()==true){
						chckbxC_1.setSelected(false);
						chckbxC.setSelected(false);
					}
									
			}});
		chckbxC.setBounds(345, 133, 39, 23);
		contentPane.add(chckbxC);
		
		chckbxC_1 = new JCheckBox("c++");
		chckbxC_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(chckbxNone.isSelected()==true){
					chckbxC_1.setSelected(false);
					chckbxC.setSelected(false);
				}
			}
		});
		chckbxC_1.setBounds(386, 133, 57, 23);
		contentPane.add(chckbxC_1);
		
		chckbxNone = new JCheckBox("none");
		chckbxNone.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(chckbxNone.isSelected()==true){
					chckbxC_1.setSelected(false);
					chckbxC.setSelected(false);
				}
			}
		});
		chckbxNone.setBounds(445, 133, 97, 23);
		contentPane.add(chckbxNone);
		
		JLabel lblCourses = new JLabel("Courses");
		lblCourses.setBounds(265, 124, 61, 42);
		contentPane.add(lblCourses);
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		if(chckbxNone.isSelected()==true){
			chckbxC_1.setSelected(false);
			chckbxC.setSelected(false);
			
		}
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
			}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
			}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
