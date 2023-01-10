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
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.TextField;

public class login {
	
	private String userName;
	private String password;
	
	private JFrame frame;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setForeground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 877, 509);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 427, 472);
		frame.getContentPane().add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("Welcome to CMS");
		lblNewLabel.setFont(new Font("Perpetua", Font.PLAIN, 34));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(481, 0, 319, 89);
		frame.getContentPane().add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(481, 309, 319, 44);
		frame.getContentPane().add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(481, 221, 319, 44);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblLogin = new JLabel("Log in!");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("Perpetua", Font.PLAIN, 28));
		lblLogin.setBounds(481, 90, 319, 89);
		frame.getContentPane().add(lblLogin);
		
		JLabel lblNewLabel_1 = new JLabel("Username or Email :");
		lblNewLabel_1.setFont(new Font("Perpetua", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(481, 189, 149, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password:");
		lblNewLabel_1_1.setFont(new Font("Perpetua", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(481, 275, 149, 22);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("Sign In");
		btnNewButton.setForeground(SystemColor.text);
		btnNewButton.setBackground(SystemColor.desktop);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = (String) textField.getText();
				if (userName.equals("Sudan")) {
					
				}
		}
		});
		
		btnNewButton.setBounds(481, 382, 130, 44);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				password = (String) e.getSource();
			}
		});
		btnNewButton_1.setForeground(SystemColor.desktop);
		btnNewButton_1.setBackground(SystemColor.text);
		btnNewButton_1.setBounds(670, 382, 130, 44);
		frame.getContentPane().add(btnNewButton_1);
	}
}
