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
import javax.swing.border.MatteBorder;
import java.awt.Dimension;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class login {
	
	private String userName;
	private String password;
	
	private JFrame frmLogin;
	private JPasswordField passwordField;
	private JTextField UserTextField;
	static String comboBoxValue ="";
	private JLabel lblNewLabel_2;

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
		frmLogin.getContentPane().setBounds(new Rectangle(500, 500, 500, 500));
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
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\sudan\\eclipse-workspace\\CourseManagementSystem\\src\\image\\Teacher-rafiki.png"));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(17, Short.MAX_VALUE)
					.addComponent(lblNewLabel_3)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(33)
					.addComponent(lblNewLabel_3)
					.addContainerGap(39, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JLabel lblNewLabel = new JLabel("Welcome to CMS");
		lblNewLabel.setFont(new Font("Perpetua", Font.PLAIN, 34));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(481, 0, 319, 89);
		frmLogin.getContentPane().add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		passwordField.setBounds(481, 309, 319, 44);
		frmLogin.getContentPane().add(passwordField);
		
		UserTextField = new JTextField();
		UserTextField.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		UserTextField.setBounds(481, 221, 319, 44);
		frmLogin.getContentPane().add(UserTextField);
		UserTextField.setColumns(10);
		
		JLabel lblLogin = new JLabel("Log in!");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("Perpetua", Font.PLAIN, 28));
		lblLogin.setBounds(481, 51, 319, 51);
		frmLogin.getContentPane().add(lblLogin);
		
		
		JComboBox UserComboBox = new JComboBox();
		UserComboBox.setFont(new Font("Perpetua", Font.PLAIN, 20));
		UserComboBox.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		UserComboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == 1) {
					comboBoxValue=(String) e.getItem();
				}
				
			}
		});
		UserComboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Admin", "Student ", "Teacher"}));
		UserComboBox.setBounds(481, 140, 319, 37);
		frmLogin.getContentPane().add(UserComboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Username or Email :");
		lblNewLabel_1.setFont(new Font("Perpetua", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(481, 198, 149, 22);
		frmLogin.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password:");
		lblNewLabel_1_1.setFont(new Font("Perpetua", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(481, 293, 149, 22);
		frmLogin.getContentPane().add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("Sign In");
		btnNewButton.setForeground(SystemColor.text);
		btnNewButton.setBackground(SystemColor.desktop);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(comboBoxValue);
				System.out.println(UserTextField.getText());
				System.out.println(passwordField.getPassword());
				if(comboBoxValue.isEmpty()) {
					lblNewLabel_2.setVisible(true);
					return;
				}
				if(UserTextField.getText().isEmpty()) {
					
					return;
					
				}
				if(passwordField.getPassword().length == 0){
					
					return;
				}
				if (UserTextField.getText().equals("admin") && Arrays.equals(passwordField.getPassword(), new char[] {'a','d','m','i','n'}) && comboBoxValue.equals("Admin")) {
					System.out.println(comboBoxValue);
					AdminDashboard window = new AdminDashboard(); 
				}else {
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
		
		lblNewLabel_2 = new JLabel("Must select a user");
		lblNewLabel_2.setVisible(false);
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Perpetua", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(481, 177, 160, 22);
		frmLogin.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Select User:");
		lblNewLabel_1_2.setFont(new Font("Perpetua", Font.PLAIN, 16));
		lblNewLabel_1_2.setBounds(481, 112, 149, 22);
		frmLogin.getContentPane().add(lblNewLabel_1_2);
		
	
	}
}
