package UIdesign;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.SpringLayout;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.TextField;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.border.BevelBorder;

public class login {
	
	private String userName;
	private String password;
	
	private JFrame frmLogin;
	private JPasswordField passwordField;
	private JTextField UserTextField;
	static String comboBoxValue ="";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	public static String toString(char[] a)
    {
        // Creating object of String class
        String string = new String(a);
 
        return string;
    }


	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.getContentPane().setBackground(new Color(255, 255, 255));
		frmLogin.getContentPane().setForeground(new Color(255, 255, 255));
		frmLogin.setBounds(100, 100, 877, 509);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 427, 472);
		frmLogin.getContentPane().add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel Image = new JLabel("New label");
		Image.setIcon(new ImageIcon("C:\\Users\\sudan\\eclipse-workspace\\CourseManagementSystem\\src\\image\\2.jpg"));
		panel.add(Image);
		
		JLabel lblNewLabel = new JLabel("Welcome to CMS");
		lblNewLabel.setFont(new Font("Perpetua", Font.PLAIN, 34));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(481, 0, 319, 89);
		frmLogin.getContentPane().add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(481, 309, 319, 44);
		frmLogin.getContentPane().add(passwordField);
		
		UserTextField = new JTextField();
		UserTextField.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255)));
		UserTextField.setBounds(481, 221, 319, 44);
		frmLogin.getContentPane().add(UserTextField);
		UserTextField.setColumns(10);
		
		JLabel lblLogin = new JLabel("Log in!");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("Perpetua", Font.PLAIN, 28));
		lblLogin.setBounds(481, 64, 319, 51);
		frmLogin.getContentPane().add(lblLogin);
		
		
		JComboBox UserComboBox = new JComboBox();
		UserComboBox.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, new Color(255, 255, 255), new Color(255, 255, 255)));
		UserComboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == 1) {
					comboBoxValue=(String) e.getItem();
				}
				
			}
		});
		UserComboBox.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Student ", "Teacher"}));
		UserComboBox.setBounds(481, 125, 319, 21);
		frmLogin.getContentPane().add(UserComboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Username or Email :");
		lblNewLabel_1.setFont(new Font("Perpetua", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(481, 189, 149, 22);
		frmLogin.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password:");
		lblNewLabel_1_1.setFont(new Font("Perpetua", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(481, 275, 149, 22);
		frmLogin.getContentPane().add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("Sign In");
		btnNewButton.setForeground(SystemColor.text);
		btnNewButton.setBackground(SystemColor.desktop);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(comboBoxValue);
				System.out.println(UserTextField.getText());
				System.out.println(passwordField.getPassword());
				if (UserTextField.getText().equals("admin") && Arrays.equals(passwordField.getPassword(), new char[] {'a','d','m','i','n'}) && comboBoxValue.equals("Admin")) {
					System.out.println(comboBoxValue);
					System.out.println("Logged in");
					AdminDashboard window = new AdminDashboard(); 
//					window.getFrmAdminDashboard.setVisible(true);
				}else {
					System.out.println("lord");
				}
		}
		});
		
		btnNewButton.setBounds(481, 382, 130, 44);
		frmLogin.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				password = (String) e.getSource();
			}
		});
		btnNewButton_1.setForeground(SystemColor.desktop);
		btnNewButton_1.setBackground(SystemColor.text);
		btnNewButton_1.setBounds(670, 382, 130, 44);
		frmLogin.getContentPane().add(btnNewButton_1);
		
	
	}
}
